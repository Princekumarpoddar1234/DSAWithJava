import java.util.*;
public class ifelse_vote {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if (age>=18)
        {
            System.out.println("You are Adult");
        }
        else if (age >12 && age < 18)
        {
            System.out.println("You are Teenager");
        }
        else
        {
            System.out.println("You are not Adult");
        }
        sc.close();
    }
}
