//print hello n times
import java.util.*;
public class while1 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();
        int i =0;
        while(i<n)
        {
            System.out.println("Hello");
            i++;
        }
        System.out.println("Printed Successfully..");
        sc.close();
    }
}
