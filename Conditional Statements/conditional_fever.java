import java.util.*;
public class conditional_fever {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fehrenheit:");
        double temp = sc.nextFloat();
        String check = (temp > 100)? "Fever" :"No Fever";
        System.out.println(check);
        sc.close();
    }
}
