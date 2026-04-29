import java.util.*;
public class while3 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("Printed Successfully..");
        sc.close();
    }
}
