import java.util.*;
public class array_binarysearch {
    public static void creation(int array[], int n) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
        sc.close();
    }
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        int array[] = new int[50];
        System.out.println("Enter size of an array:");
        int n = sc.nextInt();
        System.out.println("Enter elements of an array in ascending or descending order only:");
        creation(array, n);
        System.out.println("enter key element:");
        int key = sc.nextInt();
        int result = binarySearch(array, n, key);
        if (result ==-1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("elelemt found at"+ result + "index");
        }
        sc.close();
    }
    public static int binarySearch(int[] arr, int n, int key){
            int left=0;
            int right=n-1;
            while(left<=right){
                int mid=left+(right-left)/2;
                if(arr[mid]==key) return mid;
                else if(arr[mid]<key) left=mid+1;
                else right=mid-1;
            }
            return -1;
        }
}
