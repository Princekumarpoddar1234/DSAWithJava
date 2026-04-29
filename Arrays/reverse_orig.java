import java.util.*;
public class reverse_orig {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to reverse it:");
        int n = sc.nextInt();
        int i, rem=0,rev=0;
        i=n;
        while(i!=0)
        {
            rem = i%10;
            rev = rev*10 + rem;
            i/=10;
        }
        System.out.println("Reverse = "+ rev);
        sc.close();
    }
}
