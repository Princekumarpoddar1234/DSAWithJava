import java.util.*;
public class function21 {                     //floyd's triangle pattern
    public static void floyd_triangle(int line) {
        int pattern = 1;
        for(int i = 1; i<=line; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(pattern+" ");
                pattern++;
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        floyd_triangle(line);
        sc.close();
        // The scanner is closed to prevent resource leaks.
    }
}
