import java.util.*;
public class function27 {
    public static void number_pyramid(int line) {
        for(int i =1; i<=line; i++) {
            for(int j=1; j<=(line-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        number_pyramid(line);
        sc.close();
    }
}
