public class max_subarray_Sum_prefix {
    public static int subarray_sum(int array[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];
        prefix[0] = array[0];
        for(int i=1; i<array.length; i++)
        {
            prefix[i] = prefix[i-1] + array[i];
        }
        for(int start=0; start<array.length; start++)
        {
            for(int end =start; end<array.length; end++)
            {
                int sum =0;
                sum = start==0? prefix[end] : prefix[end]-prefix[start-1];
                if (sum>max)
                {
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String args[]) {
        int array[] = {2,4,6,8,10};
        int max_sum = subarray_sum(array);
        System.out.println("max sum = "+max_sum);
    }
}
