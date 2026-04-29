// This code is a continuation of the previous knapsack problem, implementing an unbounded knapsack problem

//unbounded knapsack allows us to take an item multiple times, unlike the 0/1 knapsack problem where each item can be taken only once.

public class DP5 {
    public static int knapsackUnbounded(int[] val, int[] wt, int W) {
        int n=val.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=0; i<n+1; i++){//setting column 0 as 0 as we can have weight 0 with no items
            dp[i][0]=0;
        }
        for(int j=0; j<W+1; j++){//setting row 0 as 0 as we can't have any value with weight 0
            dp[0][j]=0;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                if(wt[i-1]<=j){//valid case as we can include the item
                    dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]], dp[i-1][j]);//we can use current item multiple times thus we use i instead of i-1
                }else{//invalid as we can't include the item
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        print(dp);//printing the DP table for better understanding
        return dp[n][W];//final answer is at the bottom right corner of the DP table
    }
    public static void print(int[][] dp){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[]  val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W=7;
        System.out.println(knapsackUnbounded(val, wt, W));
    }
}
