import java.util.*;                     //diamond pattern
public class function26 {
    //diamond function
    //1st half
    public static void diamond(int line) {
        for(int i=1; i<=line; i++) {
            //for spaces
            for(int j =1; j<=(line-i); j++) {
                System.out.print(" ");
            }
            //for stars
            for(int j =1; j<=((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=line; i>=1; i--) {
            //for spaces
            for(int j=1; j<=(line-i); j++) {
                System.out.print(" ");
            }
            //for stars
            for(int j=1; j<=((2*i)-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //main function
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        diamond(line);
        sc.close();
    }
}
