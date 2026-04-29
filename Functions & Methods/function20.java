import java.util.*;
public class function20 {                           //inverted half pyramid pattern with number
    public static void halfPyramidNumber(int line) {
        for(int i = 1; i<=line; i++) {
            for(int pattern = 1; pattern <= (line-i+1); pattern++) {
                System.out.print(pattern);
            }
            System.out.println();
        }
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines:");
        int line = sc.nextInt();
        halfPyramidNumber(line);
        sc.close();
    }
}
