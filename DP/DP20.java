import java.util.*;
public class DP20 {
    /* Minimum Jumps to Reach the End of the Array Problem Using DP:
    Given an array of integers where each element represents the maximum number of steps that can be taken forward from that element,
    find the minimum number of jumps to reach the end of the array.
    This is a classic dynamic programming problem where we can either include or exclude a character to check for a match.
    We use a 1D dp array where dp[i] represents the minimum number of jumps required to reach the end of the array from index i.
    Time Complexity: O(n^2) and Space Complexity: O(n)
    where n is the length of the array
    */

    public static int minJumps(int[] arr){
        int n=arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        dp[n-1]=0; //last index requires 0 jumps to reach the end
        for(int i=n-2; i>=0; i--){
            int steps=arr[i];
            int ans=Integer.MAX_VALUE;
            for(int j=i+1; j<=i+steps && j<n; j++){
                if(dp[j]!=-1){
                    ans=Math.min(ans,dp[j]+1);
                }
            }
            if(ans!=Integer.MAX_VALUE) dp[i]=ans;

        }
        return dp[0];

    }
    public static void main(String[] args){
        int[] arr={2,3,1,1,4};
        System.out.println("Minimum number of jumps to reach the end of the array: " + minJumps(arr));
    }
}
// This will give us the minimum number of jumps required to reach the end of the array
// The approach is to fill the dp array from the end of the array to the start