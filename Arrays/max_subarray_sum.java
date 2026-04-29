public class max_subarray_sum {
    public static int subarray_sum(int array[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<=array.length;j++)
            {
                int sum=0;
                for(int k=i;k<j;k++)
                {
                    System.out.print(array[k]+" ");
                    sum=sum+array[k];
                }
                if (sum>max)
                {
                    max=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        return max;
    }
    public static void main(String args[]) {
        int array[] = {2,4,6,8,10};
        int max_sum=subarray_sum(array);
        System.out.print("maximum sum= "+ max_sum);
    }
}
