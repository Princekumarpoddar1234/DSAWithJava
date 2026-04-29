//linear search in array
/* import java.util.*;
public class array_linearsearch {
    public static void creation(int array[], int n) {
        for(int i =0; i<n; i++) {
            array[i]=sc.nextInt();
        }
    }
    public static int linearsearch(int array[], n) {
        for(int i=0; i<n; i++) {
            if (array[i]== key) {
                return i;
            }
            return -1;
        }
    }
    public static void main(String args []) {
        int array[] = new int [50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = sc.nextInt();
        creation (array[],n);
        System.out.println("Enter key element:");
        int key = sc.nextInt();
        System.out.println("is element found?"+linearsearch(array[], key));
    }
}                   */
import java.util.*;
public class array_linearsearch {
    public static int linearsearch(int array[],int key) {
        for(int i =0; i<array.length; i++) {
            if (array[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args []) {
        int array[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key:");
        int key = sc.nextInt();
        int index = linearsearch(array, key);
        if (index==-1) {
            System.out.println("Element not found");
        }
        else{
            System.out.println("element found at "+ index + " index");
        }
        sc.close();
    }
}