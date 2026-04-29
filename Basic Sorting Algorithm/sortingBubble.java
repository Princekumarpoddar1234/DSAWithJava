public class sortingBubble {
    public static void bubbleSorting(int array[]) {
        int n= array.length;
        for(int turn =0; turn<n-1; turn++)
        {
            int swap=0;
            for(int j=0; j<n-1-turn; j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap++;
                }
            }
            if (swap==0)
            break;
        }
    }
    public static void trace(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int array[] = {5,4,1,3,2};
        trace(array);
        System.out.print("sorted array: ");
        bubbleSorting(array);
        trace(array);
    }
}