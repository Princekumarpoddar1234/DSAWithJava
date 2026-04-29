import java.util.*;                //check of even_odd number using function giving true or false respectively
public class function15 {
    public static boolean isEven(int n) {
        if ((n%2)==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check for odd_even:");
        int n = sc.nextInt();
        System.out.println(isEven(n));
        sc.close();
    }
}
