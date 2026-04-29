import java.util.*;
public class pairs_array {
    public static void pair(int array[],int size) {
        for(int i = 0; i<size; i++)
        {
            int current = array[i];
            for(int j = i+1; j < size; j++)
            {
                System.out.print("("+current+","+array[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void create(int array[], int size)
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        sc.close();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        create(array,size);
        pair(array,size);
        sc.close();
    }
}
