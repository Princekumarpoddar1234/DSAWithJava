import java.util.*;
public class break_use {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number:");
            int n = sc.nextInt();
            if ((n%10) == 0)
            {
                System.out.println("Provided number is multiple of 10, therefore i'm  out of the loop");
                break;
            }
            System.out.println("Given number:"+n);
        }while(true);
        sc.close();
        System.out.println("Loop terminated successfully.");
    }
}