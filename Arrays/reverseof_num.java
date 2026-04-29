import java.util.*;
public class reverseof_num {          //using while with method 1
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get its reverse:");
        int n = sc.nextInt();
        int rem=0,i, rev = 0; 
        i=n;
        while(i!=0)
        {
            rem = i%10;
            rev = rev*10 + rem;
            i = i/10;
        }
        System.out.println("Reverse of given number = "+ rev);
        sc.close();
    }
}
