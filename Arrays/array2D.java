import java.util.*;
public class array2D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[][] = new int[3][3];
        int m= array.length;
        int n=array[0].length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("Enter data:");
                array[i][j]= sc.nextInt();
            }
        }

        System.out.println("entered data:");
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}