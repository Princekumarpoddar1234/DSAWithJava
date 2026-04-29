import java.util.*;
public class binary_search_array {
    public static int binary_search(int array[], int key, int size)
    {
        int high = size;
        int low = 0;
        int mid = (low+high)/2;
        for(int i = 0; i<size; i++) {
            mid = (low+high)/2;
            if (array[mid]==key)
            {
                return mid+1;
            }
            else if (array[mid]>key)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return 0;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        int array[] = new int[100];
        System.out.print("enter size of array:");
        int size = sc.nextInt();
        System.out.println("enter element in ascending or descending order");
        for(int i=0; i<size; i++)
        {
            System.out.print("enter "+(i+1)+" element:");
            array[i]= sc.nextInt();
        }
        System.out.print("enter element to find:");
        int key = sc.nextInt();
        int flag = binary_search(array,key, size);
        if (flag!=0)
        {
            System.out.print("element found at "+flag+" position");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
