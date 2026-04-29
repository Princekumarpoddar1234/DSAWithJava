import java.util.ArrayList;
public class arraylist8 {
    private static int storeWater2(ArrayList<Integer> height){
        int maxWater =0;
        //optimised Approach-2 pointer Approach
        int left =0, right=height.size()-1;
        while(left<right){
            int height1 = height.get(left);
            int height2 = height.get(right);
            int ht = Math.min(height1, height2);
            int width=right-left;
            int currWater = ht*width;
            maxWater = Math.max(currWater, maxWater);

            if(height1<height2){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;
    }
    private static int storeWater1(ArrayList<Integer> height){
        int maxWater=0;
        //brute force
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int ht = Math.min(height.get(j), height.get(i));
                int width = j-i;
                int currWater=  width*ht;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println("Using Brute Force Approach: "+storeWater1(height));
        System.out.println("Using Optimised Approach: "+storeWater2(height));
    }
}
