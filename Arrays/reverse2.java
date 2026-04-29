import java.util.*;
public class reverse2 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get its reverse:");
        int n = sc.nextInt();
        for(int i=n ; i!=0 ;i/=10)
        {
            if ((i%10)==0)
            System.out.print(0);
            else
            {
                System.out.print(i%10);
            }
        }
        sc.close();
    }
}
