import java.util.*;                 //sum of digits of given number using function
public class function17 {
    public static void sumOfDigits(int n) {
        int i, rem =0,sum =0;
        i=n;
        while(i!=0) {
            rem = i%10;
            sum+=rem;
            i=i/10;
        }
        System.out.println("Sum of digits of given number = "+sum);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        sumOfDigits(n);
        sc.close();
    }
}
