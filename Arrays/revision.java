public class revision{
    public static void subarray(int array[]) {
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {
                System.out.print("(");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(" "+array[k]+" ");
                }
                System.out.print("), ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int array[] = {2,4,6,8,10};
        subarray(array);
    }
 }