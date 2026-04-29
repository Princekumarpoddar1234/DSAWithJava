import java.util.*;
public class condition_leapyear {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check for leap year:");
        int year = sc.nextInt();
        String leapcheck = ((year%4)==0)? (((year%100)==0)? (((year%400)==0)? "Leap year" : "Non leap year") : "Leap year") : "Non leap year";
        System.out.println(leapcheck);
        sc.close();
    }
}
