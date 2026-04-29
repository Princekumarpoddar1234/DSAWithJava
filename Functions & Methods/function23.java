import java.util.*;
public class function23 {
    public static void butterfly(int line) {
        for(int i = 1 ; i<=line; i++) {                //for first half of pattern
            for(int j = 1; j<=i; j++ ) {
                System.out.print("*");
            }
            for(int j =1; j<=2*(line-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = line; i>=1; i--) {                        //for second half
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j=1; j<=2*(line-i); j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line  = sc.nextInt();
        butterfly(line);
        sc.close();
        // The scanner is closed to prevent resource leaks.
    }
}
