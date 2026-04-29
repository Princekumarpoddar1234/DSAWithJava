import java.util.*;
public class ifelse_oddeven {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        int num = sc.nextInt();
        if (num%2==0)
        {
            System.out.println("Number given is Even");
        }
        else{
            System.out.println("Number given is odd");
        }
        sc.close();
    }
}
