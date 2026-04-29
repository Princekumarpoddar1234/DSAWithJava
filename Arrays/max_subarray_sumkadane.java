public class max_subarray_sumkadane {
    public static void kadane(int array[]) {
        int max_sum = Integer.MIN_VALUE, flag = Integer.MIN_VALUE, current=0,count=0;
        for(int i=0;i<array.length;i++)
        {
            current+=array[i];
            if (current<0)
            current=0;

            max_sum= Math.max(current,max_sum);
            if (array[i]<0)
            {
                count++;
                if (flag<array[i])
                flag = array[i];
            }
        }
        if (count==array.length)
        {
            System.out.println("max subarray sum = "+flag);
        }
        else
        {
            System.out.println("max subarray sum = "+max_sum);
        }
    }
    public static void main(String args []) {
        int array[] = {-2,-4,-6,-8,-10};
        kadane(array);
    }
}
