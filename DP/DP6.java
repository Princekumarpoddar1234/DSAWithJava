public class DP6 {
    public static int coinChange(int[] coins, int sum){
        int n=coins.length;
        int[][] dp = new int[coins.length+1][sum+1];
        //step1:Initialization
        for(int i=0; i<n+1; i++) dp[i][0]=1;//no need to initialize first col as java gives 0 by default

        //step2:working on dp
        for(int i=1; i<n+1;i++){
            for(int j=1; j<sum+1; j++){
                if(coins[i-1]<=j){//valid case as we can include the coin
                    dp[i][j]=dp[i][j-coins[i-1]] + dp[i-1][j];
                }else{//exclude case as we can't include the coin
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    private static int  coinChange1D(int[] coins, int sum){
        int[] dp = new int[sum+1];
        dp[0]=1; //base case as we can always form sum=0 with an empty set of coins
        for(int coin:coins){
            for(int j=coin; j<=sum; j++){
                dp[j]+=dp[j-coin]; //we can use the current coin multiple times, thus we add the ways to form (j-coin) to the ways to form j
            }
        }
        return dp[sum]; //final answer is at the last index of the dp array storing the number of ways to form the sum
    }
    public static void main(String[] args){
        int[] coins1={2,5,3,6};
        int sum1=10;
        int[] coins2={1,2,3};
        int sum2=4;
        System.out.println(coinChange(coins1,sum1));

        System.out.println(coinChange(coins2, sum2));

        System.out.println("Using 1D array dp: "+coinChange1D(coins1, sum1));
        System.out.println("Using 1D array dp: "+coinChange1D(coins2, sum2));//using 1D array for space optimization
    }
}