import java.util.*;
public class function28 {
    public static void palindromic_number_pattern(int line) {         //palindrome number pattern
        for(int i=1; i<=line; i++) {
            for(int j=1; j<=(line-i); j++) {
                System.out.print(" ");
            }
            for(int j=i;j>=1; j--) {
                System.out.print(j);
            }
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        palindromic_number_pattern(line);
        sc.close();
    }
}
