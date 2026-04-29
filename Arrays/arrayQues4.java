public class arrayQues4 {
    public static int waterTrap(int height[]) {
        int waterTrap =0;
        int n= height.length;
        //auxiliary array fro startng
        int start[] = new int[n];
        start[0] = height[0];
        for(int i=1; i<n; i++)
        {
            start[i] = Math.max(start[i-1], start[i]);
        }

        //auxiliary array from end
        int end[] = new int[n];
        end[n-1] = height[n-1];
        for(int i=n-2; i>0; i--)
        {
            end[i] = Math.max(end[i], end[i+1]);
        }

        //waterTrapped
        for(int i=0; i<n; i++)
        {
            int waterLevel = 0;
            waterLevel =Math.min(start[i], end[i]);
            int diff = (waterLevel - height[i]);
            waterTrap+= diff>0? diff : 0;
        }
        return waterTrap;
    }
    public static void main(String args[]) {
        int height[] = {4,2,0,3,2,5};
        System.out.println("Water Trapped = "+waterTrap(height));
    }
}
