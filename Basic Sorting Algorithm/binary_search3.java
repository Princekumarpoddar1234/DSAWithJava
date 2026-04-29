import java.util.*;
public class binary_search3 {
    public static int binary_search(int array[], int key)
    {
        int low=0,high = array.length-1;
        int mid = (low + high) /2;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if (array[mid]==key)
            {
                return mid;
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
        return -1;
}
public static void create(int array[],int size) {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<size; i++)
    {
        System.out.println("Enter "+(i+1)+" element");
        array[i] = sc.nextInt();
    }
    sc.close();
}
public static void main(String args [])
{
    Scanner sc = new Scanner(System.in);
    int array[] = new int[100];
    System.out.println("enter size of element:");
    int size = sc.nextInt();
    create(array,size);
    System.out.println("enter key element:");
    int key = sc.nextInt();
    int result = binary_search(array,key);
    if (result == -1)
    {
        System.out.println("Element not found");
    }
    else 
    {
        System.out.println("element found at index "+result);
    }
}
}