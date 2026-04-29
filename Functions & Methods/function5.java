import java.util.*;
public class function5 {
    public static int factorial(int n) {
        int fac = 1;
        for(int i =1; i<=n; i++)
        {
            fac*=i;
        }
        return fac;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to get its factorial");
        int n = sc.nextInt();
        System.out.println("Factorial of given number = "+factorial(n));
        sc.close();
    }
}
