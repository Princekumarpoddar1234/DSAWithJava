import java.util.*;
public class function9 {                     //prime number check using function(none optimized)
    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n==2)
        {
            return isprime;
        }
        else
        {
            for(int i = 2; i<n; i++)
            {
                if ((n%i) == 0)
                {
                    isprime=false;
                    break;
                }
            }
            return isprime;
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check for prime:");
        int n = sc.nextInt();
        System.out.println("Given number is prime?"+ isprime(n));
        sc.close();
    }
}
