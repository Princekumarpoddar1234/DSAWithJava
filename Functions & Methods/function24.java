import java.util.*;
public class function24 {                    //solid rhombus star pattern
    public static void solid_rhombus(int line) {
        for(int i = 1; i<=line; i++) {
            for(int j =1; j<=(line-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=line; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        solid_rhombus(line);
        sc.close();
    }
}
