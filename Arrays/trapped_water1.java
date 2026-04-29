public class trapped_water1 {
    public static int waterTrapped(int array[]) {
        //leftMost array
        int n = array.length;
        int leftmost[] = new int[n];
        leftmost[0] = array[0];
        for(int i=1; i<n; i++)
        {
            leftmost[i] = Math.max(array[i],leftmost[i-1]);
        }

        //rightMost array
        int rightmost[] = new int[n];
        rightmost[n-1] = array[n-1];
        for(int i=n-2; i<n; i++)
        {
            rightmost[i] = Math.max(array[i],rightmost[i+1]);
        }

        //trappedwater
        int trapped_water =0;
        for(int i=0; i<n; i++)
        {
            int waterHeight= Math.min(rightmost[i],leftmost[i]);
            trapped_water+= waterHeight-array[i];
        }
        return trapped_water;
    }
    public static void main(String args[]) {
        int array[] = {4,2,0,6,3,2,5};
        int result = waterTrapped(array);
        System.out.print("water trapped = "+ result );
    }
}
