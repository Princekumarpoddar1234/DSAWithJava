import java.util.*;               //sum of two numbers using function
public class function2 {
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = sum(a,b);
        System.out.println("sum = "+result);
        sc.close();
    }
}
