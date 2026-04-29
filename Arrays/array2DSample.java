import java.util.*;
public class array2DSample {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int array[][] = new int[3][3];
        int m= array.length, n= array[0].length;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("enter data:");
                array[i][j]= sc.nextInt();
            }
        }
        //search element asking
        System.out.print("enter search element:");
        int key = sc.nextInt();//yellow line because it is not used in the code, we can use it to search an element in the array
       
        //traverse(array,m,n);
        sc.close();
    }

    //traversing
    public static void traverse(int array[][], int m, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    }

    //search element
    public static boolean search(int array[][], int m, int n, int key) {
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if (array[i][j]==key) {
                    System.out.println("element found at index ["+i+"]["+j+"]");
                    return true;
                }
            }
        }
        System.out.print("not found");
        return false;
    }
}
