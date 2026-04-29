// This code is a continuation of the previous DP3.java file, implementing a target sum subset

public class DP4 {//O(n*sum) time and space complexity
    public static boolean targetSumSubset(int[] arr, int sum){
        int n=arr.length;
        //we can say base case is column 0 is true because we can always form sum 0 with an empty subset
        //but we can't form any positive sum with an empty subset, thus first row is false except for the first column
        boolean[][] dp = new boolean[n+1][sum+1];
        for(int i=0; i<n+1; i++){//initialization
            //i=items & j=target sum
            dp[i][0]=true;
        }//since by default every index is false so we don't need to initialize first row as false
        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                int v=arr[i-1];

                //include
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        print(dp);//just to see the DP table
        return dp[n][sum];//final answer is at the bottom right corner of the DP table
    }
    public static void print(boolean[][] dp){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {4,2,7,1,3};
        int sum=10;
        System.out.println(targetSumSubset(arr, sum));
    }
}