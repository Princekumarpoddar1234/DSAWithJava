public class trapped_water2 {
    public static int rainTrappedWater(int height[]) {
        //leftmax
        int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++)
        {
            leftmax[i] = Math.max(leftmax[i-1],height[i]);
        }

        //rightmax array
        int rightmax[] =new int[n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        //waterTrapped
        int trapped_water =0;
        for(int i=0; i<n; i++)
        {
            int waterheight =0;
            waterheight = Math.min(leftmax[i], rightmax[i]);
            trapped_water+= waterheight - height[i];
        }
        return trapped_water;
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(rainTrappedWater(height));
    }
}
