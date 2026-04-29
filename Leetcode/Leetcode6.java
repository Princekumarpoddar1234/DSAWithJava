
    // public static void rotate(int[] nums, int k) {
    //     for(int i =0; i<k; i++){
    //         int value = nums[nums.length-1];
    //         for(int j = nums.length-1; j>=i; j++){
    //             nums[j+1] = nums[j];
    //         }
    //         nums[i] = value;
    //     }
    // }
    // public static void print(int nums[]){
    //     for(int i =0; i<nums.length; i++){
    //         System.out.print(nums[i]+" ");
    //     }
    //     System.out.println();
    // }
    

    // public static void main(String args[]) {
    //     int nums[] = {1,2,3,4,5,6,7};
    //     rotate(nums, 3);
    //     print(nums);
    // }
package Leetcode;
public class Leetcode6 {
    public static void rotate(int[] nums, int k) {
        for(int i =0; i<k; i++){
            int value = nums[nums.length-1];
            for(int j = nums.length-1; j>=i; j--){
                nums[j] = nums[j-1];
            }
            nums[i] = value;
        }
    }

    public static void print(int nums[]){
        for(int i =0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    

    public static void main(String args[]) {
        int nums[] = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        print(nums);
    }
}