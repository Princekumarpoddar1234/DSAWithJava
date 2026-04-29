//import java.util.Arrays;
// class Leetcode3 {
    // public static int removeElement(int[] nums, int val) {
    //     for(int i=0; i<nums.length; i++){
    //         if (nums[i] != val){
    //             count++;
    //         }
    //     }
    //     int resultindex=0, index;
    //     for(index=0; index<nums.length; index++){
    //         if(nums[index]!=val){
    //             nums[resultindex] = nums[index];
    //             resultindex++;
    //         }
    //     }
    package Leetcode;
    class Leetcode3 {
        public static int removeElement(int[] nums, int val) {
            int index = 0; // This will keep track of the position in the modified array
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            
            // The new array is the first 'index' elements of 'nums'
            
    
        
        for(int i=0; i<index; i++){
            System.out.print(nums[i]+ " ");
        }
        return index;
    
    }

    public static void main(String args[]) {
        int nums[] = {1,2,3,4,2,5,2,6};
        System.out.println(removeElement(nums, 2));
    }
}