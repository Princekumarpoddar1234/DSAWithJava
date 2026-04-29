import java.util.*;
public class DP10 {
    public static int longestIncreasingSubsequence(int[] arr){
        //longest increasing subsequnce means it will be LIS only when it has distinct sorted elements in a subsequence
        //we know how to find LCS, so if we compare the given array with sorted array with distinct elements then it is LIS
        //here we first used HashSet to remove duplicates and then we sort the array

        //Step1:
        HashSet<Integer> set = new HashSet<>();
        for(int num:arr) set.add(num);

        //Step2:copy to array from HashSet
        int[] sorted = new int[set.size()]; 
        int idx=0;
        for(int num:set) sorted[idx++]=num;

        //Step3:sorting and creation of dp
        Arrays.sort(sorted);
        int n=arr.length, m=sorted.length;
        int[][] dp = new int[n+1][m+1];

        //step4:initialize row0 and col0 with 0 as we can't have common subsequence when any other given array is empty | well we are not doing it because java bydefault initializes to 0
        //but we are commenting its need for the clarity that it is needed as initialization step

        //step5: working with dp with lcs style mode
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(arr[i-1]==sorted[j-1]){//if elements matches, then we are going to consider them in subsequence
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{//if elements do not match, then we have two choices: either exclude the last element of arr or sorted
                    int ans1=dp[i-1][j];//excluding element of arr
                    int ans2=dp[i][j-1];//excluding element of sorted
                    dp[i][j]=Math.max(ans1,ans2);//we take the maximum of both choices we made
                }
            }
        }
        //Step6: return the final answer
        return dp[n][m];//this is the final answer which is the length of longest increasing subsequence

    }
    public static void main(String[] args){
        int[] arr = {50,3,10,7,40,80};
        System.out.println("Using LCS with self designed sorted array to find LIS: "+longestIncreasingSubsequence(arr));//using LCS with self designed sorted array to find LIS
    }
}