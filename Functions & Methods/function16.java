import java.util.*;
public class function16 {                          //Palindrome number check using function
    public static void palindrome(int n) {
        int i, rev=0,rem=0;
        i=n;
        while(i!=0) {
            rem =i%10;
            rev=rev*10+rem;
            i=i/10;
        }
        if (rev==n) {
            System.out.println("Given number is Palindrome");
        }
        else {
            System.out.println("given number is non-Palindrome");
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        palindrome(n);
        sc.close();
    }
}
