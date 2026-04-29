import java.util.*;               //product of two numbers using function
public class function4 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a,b);
        System.out.println("Product of given numbers = "+ prod);
        sc.close();
    }
}
