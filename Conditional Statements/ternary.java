import java.util.*;
public class ternary {
    public static void main(String args []) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number to check for even-odd:");
        int num = sc.nextInt();
        String type = ((num%2)==0)?"Even" :"Odd";
        System.out.println(type);
        sc.close();
    }
}
