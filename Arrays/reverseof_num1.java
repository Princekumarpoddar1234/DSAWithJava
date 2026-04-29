import java.util.*;               //method 2 using while loop
public class reverseof_num1 {
    public static void main(String args []) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        i=n;
        while(i!=0)
        {
            if ((i%10)==0)
            {
                System.out.print(0);
            }
            else
            {
                System.out.print(i%10);
            }
            i/=10;
        }
        sc.close();
    }
}
