public class trapped_water {
    public static void auxiliary_matrix(int array[],int left_max[], int right_max[]) {
        int n= array.length;
        left_max[0] = array[0];
        right_max[n-1]= array[n-1];
        
        for(int i=1; i<n;i++)
        {

            left_max[i]=Math.max(left_max[i-1],array[i]);
        }

        System.out.print("left_max array = ");
        for(int i=0; i<n;i++)
        {
            System.out.print(left_max[i]+ " ");
            
        }
        System.out.println();


        for(int i=n-2;i<=0;i--)
        {
            right_max[i]= Math.max(array[i], right_max[i+1]);
        }
        System.out.print("left_max array = ");
         for(int i=0; i<n;i++)
        {
            System.out.print(right_max[i]+ " ");
            
        }
        System.out.println();
    }


    public static int water_trapped(int array[], int left_max[], int right_max[]) {
        int trapped = 0;
        if (array.length<=2)
        {
            return 0;
        }
        else
        {
            for(int i=0; i<array.length; i++)
        {
            int waterLevel = 0;
            waterLevel = Math.min(left_max[i],right_max[i]);
            trapped+=waterLevel - array[i];
        }
        return trapped;
        }
    }


    public static void main(String args []) {
        int array[] = {4,2,0,6,3,2,5};
        int left_max[] = new int[array.length];
        int right_max[] = new int[array.length];
        auxiliary_matrix(array, left_max, right_max);
        System.out.print("trapped water = "+ water_trapped(array, left_max, right_max));
    }
}