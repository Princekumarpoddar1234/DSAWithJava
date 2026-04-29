import java.util.*;
public class DP3 {
    public static int knapsack(int[] val, int[] wt, int W, int n) {
        if(W == 0 || n ==0){//this is the base case and why compute when yout don't have any of these two changing variables
            return 0;
        }
        if(wt[n-1]<=W){//valid
            //include
            int ans1 =val[n-1] + knapsack(val, wt, W-wt[n-1], n-1);
            //exclude
            int ans2 = knapsack(val, wt, W, n-1);
            return Math.max(ans1, ans2);//maxValue return for next step of recursion or recursive call
        }else{//invalid 
            return knapsack(val, wt, W, n-1);
        }
    }

    public static int knapsackMemo(int[] val, int[] wt, int W, int n, int[][] dp){
        if(W == 0 || n == 0){//this is the case when we can stop computation because after null of any of these two means waste of time
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];//if already calculated then no need to calculate again and just return to avoid over computation
        }
        if(wt[n-1] <= W){//valid
            //included
            int ans1=val[n-1]+knapsackMemo(val, wt, W-wt[n-1], n-1, dp);
            //excluded
            int ans2=knapsackMemo(val, wt, W, n-1, dp);

            dp[n][W]=Math.max(ans1, ans2);//storing best of two
            return dp[n][W];
        }else{
            dp[n][W]=knapsackMemo(val, wt, W, n-1, dp);
            return dp[n][W];
        }
    }
    public static int knapsackTabulation(int[] val, int[] wt, int W) {
        int[][] dp = new int[val.length+1][W+1];
        for(int i=0; i<W+1; i++){//horizontal
            dp[0][i]=0;
        }
        for(int i=0; i<val.length+1; i++){//vertical
            dp[i][0]=0;
        }
        for(int i=1; i<val.length+1; i++){//because we are considering 0 as value thus we are taking one extra row and column
            for(int j=1; j<W+1; j++){
                int v=val[i-1];//zero index based value
                int w=wt[i-1];//as we have to take value value from index i which is zero index based
                
                if(w<=j){//valid case and here j is depicting weight on behalf of which we are finding profit in 2D manner
                    //included
                    int incProfit=v+dp[i-1][j-w];
                    //exclude
                    int excProfit=dp[i-1][j];

                    dp[i][j]=Math.max(incProfit,excProfit);//max for next index i,j with weight j
                }else{//invalid
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        // we are printing this table for better understanding
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

        return dp[val.length][W];//this last index stores maxProfit from bottom up approach
    }
    public static void main(String[] args) {
        int[] val = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int W=7;
        //System.out.println(knapsack(val, wt, W, val.length));
        int[][] dp = new int[val.length+1][W+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        //System.out.println(knapsackMemo(val, wt, W, val.length, dp));

        System.out.println("MaxProfit = "+knapsackTabulation(val, wt, W));
    }
}
