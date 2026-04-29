import java.util.*;
public class calculator {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operator from +, -, *, /, %");
        char choice = sc.next().charAt(0);
        switch(choice) {
            case '+':System.out.println("Addition = "+(a+b));
            break;
            case '-':System.out.println("Subtraction = "+(a-b));
            break;
            case '*':System.out.println("Multiplication = "+(a*b));
            break;
            case '/':System.out.println("Division = "+(a/b));
            break;
            case '%':System.out.println("remainder = "+(a%b));
            break;
            default :System.out.println("wrong Choice");
        }
        sc.close();
        System.out.println("Calculation completed successfully.");

    }
}
