import java.util.*;                       //sum using function
public class function1 {
    public static void printHelloWorld() {
        System.out.println("Hello User");
    }

    public static void sum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum = "+sum);
    }
    public static void main(String args []) {
        printHelloWorld();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
        sc.close();
    }
}
