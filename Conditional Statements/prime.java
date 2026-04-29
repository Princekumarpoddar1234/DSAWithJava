import java.util.*;
public class prime {
    public static void main(String args []) {
        Scanner sc =new Scanner(System.in);
        System.out.print(":Enter your Number:");
        int n = sc.nextInt();
        boolean istrue = true;
        if (n==2)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            for(int i=2; i<=Math.sqrt(n); i++)
            {
                if ((n%i)==0)
                istrue = false;
                break;
            }
        }
        if (istrue==true)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Composite number");
        }
        sc.close();
    }
}
