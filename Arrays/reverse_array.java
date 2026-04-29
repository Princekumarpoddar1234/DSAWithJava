import java.util.*;
public class reverse_array {
    public static void reverse(int array[])
    {
        int start = 0,end = array.length-1;
        while(start<end)
        {
            int temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            start++;
            end--;
        }
    }
    public static void create(int array[], int size) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<size; i++)
        {
            System.out.print("enter "+(i+1)+" element");
            array[i]=sc.nextInt();
        }
        sc.close();
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        System.out.print("enter size of array");
        int size = sc.nextInt();
        create(array,size);
        System.out.println("original array is ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println();
        reverse(array);
        System.out.print("reverse array is ");
        int i=0;
        while(i<size)
        {
            System.out.print(" "+array[i]);
            i++;
        }
        sc.close();
    }
}