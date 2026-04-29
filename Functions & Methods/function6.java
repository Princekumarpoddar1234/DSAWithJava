import java.util.*;
public class function6 {
    public static int factorial(int n) {
        int fac = 1;                                    //binomial coeffecient using function
        for(int i =1; i<=n; i++)
        {
            fac*=i;
        }
        return fac;
    }

    public static int binCoeff(int n, int r) {
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int nr_fac = factorial((n-r));
        int result= n_fac/(r_fac*nr_fac);
        return result;
    }

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and r respectively");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Binomial Coeffecient of given values = " + binCoeff(n,r));
        sc.close();
    }
}
