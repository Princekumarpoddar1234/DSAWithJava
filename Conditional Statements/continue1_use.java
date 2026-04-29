import java.util.*;
public class continue1_use {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter you number:");
            int n = sc.nextInt();
            if ((n%10) == 0)
            {
                continue;
            }
            System.out.println("Given number:"+n);
        }while(true);
        // The above code will keep asking for a number and will skip printing the number if it ends with 0.
        // Note: The loop will run indefinitely due to the 'while(true)' condition.
        // To stop the program, you will need to manually terminate it.
        //no sc.close() here as the loop is infinite
    }
}
