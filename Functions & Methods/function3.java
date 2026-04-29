import java.util.*;             //swapping using call by value function
public class function3 {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = "+a + " b = "+ b);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b for swapping:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
        System.out.println("Values of a and b outside function call");
        System.out.println("a = "+a + " b = "+b);
        sc.close();
    }
}
