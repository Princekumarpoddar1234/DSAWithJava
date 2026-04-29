public class selectionSorting {
    public static void selectionSort(int array[]) {
        int n = array.length;
        for(int i=0; i<n-1; i++)
        {
            int minPos=i;
            for(int j=i+1; j<n; j++)
            {
                if (array[minPos]>array[j])
                {
                    minPos=j;
                }
            }
            int temp=array[minPos];
            array[minPos]=array[i];
            array[i]=temp;
        }

        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String args[]) {
        int array[] ={4,5,1,7,0};
        System.out.println("after sorting: ");
        selectionSort(array);
    }
}
