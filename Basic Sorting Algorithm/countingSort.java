public class countingSort {
    public static void traverse(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
    public static void countingSortAlgo(int array[]) {
        //max element for count array size
        int high=Integer.MIN_VALUE;
        for(int i=0; i< array.length; i++) {
            high = Math.max(high,array[i]);
        }

        //count array size
        int count[] = new int[high+1];
        for(int i=0; i<array.length; i++) {
            count[array[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0) {
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]) {
        int array[] = {1,3,4,5,1,5,7};
        System.out.print("unsorted array: ");
        traverse(array);
        System.out.print("Sorted array: ");
        countingSortAlgo(array);
        traverse(array);
    }
}
