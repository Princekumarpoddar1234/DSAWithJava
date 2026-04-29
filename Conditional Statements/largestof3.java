import java.util.*;
public class largestof3 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b and c respectively:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println("a is the largest number of 3");
        }
        else if (b>a && b>c)
        {
            System.out.println("b is the largest number of 3");
        }
        else
        {
            System.out.println("c is the largest number of 3");
        }
        sc.close();
    }
}
