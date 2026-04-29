import java.util.*;
public class function22 {
    public static void triangle_0_1(int line) {
        for(int i =1 ; i<=line; i++) {
            for(int j =1 ; j<=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line  = sc.nextInt();
        triangle_0_1(line);
        sc.close();
    }
}
