import java.util.*;
public class largest_number {
    public static void largest_number_of_array(int array[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++)
        {
            if (largest < array[i])
            {
                largest = array[i];
            }
        }
        System.out.println("Largest number is "+largest);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int [100];
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.print("enter "+(i+1)+" element");
            array[i] = sc.nextInt();
        }
        largest_number_of_array(array);
        sc.close();
    }
}
