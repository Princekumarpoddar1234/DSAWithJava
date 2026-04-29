import java.util.*;
public class conditionalposneg {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check positive or negative:");
        int a = sc.nextInt();
        String output = (a>=0)? "Positive" : "Negative";
        System.out.println("Given number is "+ output);
        sc.close();
    }
}
