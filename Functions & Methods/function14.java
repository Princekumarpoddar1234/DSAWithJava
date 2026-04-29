import java.util.*;
public class function14 {                  //avg to 3 numbers using function
    public static void avg(int n1, int n2, int n3) {
        float avg = (float)(n1 + n2 + n3)/3f;
        System.out.println("average of given 3 numbers = "+avg);
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers to get their average");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        avg(n1,n2,n3);
        sc.close();
    }
}
