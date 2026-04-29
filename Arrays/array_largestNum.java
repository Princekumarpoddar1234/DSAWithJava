import java.util.*;
public class array_largestNum {
    public static void creation(int array[], int n) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            array[i]= sc.nextInt();
        }
        sc.close();
    }
    public static int largest(int array[], int n) {
        int lar=Integer.MIN_VALUE;                       //Integer.MIN_VALUE is used to represent minus infinty
        for(int i=0; i<n; i++) {
            if (lar<=array[i]) {
                lar = array[i];
            }
        }
        return lar;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        int array[] = new int [50];
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        System.out.println("enter elements of an array");
        creation(array, n);
        int largest = largest(array, n);
        System.out.println("Largest number is "+ largest);
        sc.close();
    }
}
