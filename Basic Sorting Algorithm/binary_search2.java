import java.util.*;
public class binary_search2 {
    public static int binary_search(int array[], int key)
    {
        int start=0, end = array.length-1;
        int mid = (start+end)/2;
        while(start<=end)
        {
            if (array[mid]==key)
            {
                return mid+1;
            }
            else if (key<=array[mid])
            {
                end = mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return 0;
    }
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("enter elements of array in ascending or descending order");
        for(int i = 0; i<size; i++)
        {
            System.out.print("Enter "+(i+1)+" element:");
            array[i]=sc.nextInt();
        }
        System.out.print("Enter key element to find:");
        int key = sc.nextInt();
        int flag = binary_search(array,key);
        if (flag!=0)
        {
            System.out.println("Element found at "+flag+" location");
        }
        else{
            System.out.println("element not found");
        }
    }
}
