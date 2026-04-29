import java.util.*;
public class function25 {
    public static void hollow_rhombus(int line) {
        for(int i =1; i<=line; i++) {
            for(int j=1; j<=(line-i); j++) {
                System.out.print(" ");
            }
            for(int j =1; j<=line; j++) {
                if (i==1 || i==line || j==1 || j==line) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        hollow_rhombus(line);
        sc.close();
    }
}
