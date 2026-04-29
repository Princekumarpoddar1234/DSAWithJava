import java.util.*;
public class ifelse_largestof2 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b respectively:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>=b)
        {
            System.out.println("a greater than b");
        }
        else{
            System.out.println("b greater than a");
        }
        sc.close();
    }
}
