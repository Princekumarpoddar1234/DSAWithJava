import java.util.*;
public class subarray {
    //This code generates and prints all possible contiguous subarrays from a user-input array

    public static void generateSubarray(int array[], int size) {
        for(int i=0; i<size;i++)
        {
            int current = array[i];
            for(int j=i+1; j<=size; j++)
            {
                System.out.print("{");
                System.out.print(current);
                for(int k=i+1; k<j; k++)
                {
                    System.out.print(","+array[k]);
                }
                System.out.print("} ,");
            }
        }
    }
    public static void create(int array[], int size)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++)
        {
            System.out.print("Enter "+(i+1)+"element:");
            array[i]=sc.nextInt();
        }
        sc.close();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        create(array,size);
        generateSubarray(array,size);
        sc.close();
    }
}
