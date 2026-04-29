import java.util.*;
public class largest3 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b and c respectively:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result;
        if (a >= b && a >= c)
        {
            result = a;
        }
        else if (b >= a && b >= c)
        {
            result = b;
        }
        else
        {
            result = c;
        }
        System.out.println("largest number is "+result);
        sc.close();
    }
}
