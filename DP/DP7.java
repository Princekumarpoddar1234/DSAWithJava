public class DP7 {
    /* Rod Cutting Problem Using DP
    given lengths and prices of rod pieces, find the maximum obtainable value for a given total length
    this is a classic dynamic programming problem where we can either include or exclude a rod piece to maximize the value
    the approach is similar to the coin change problem, but here we maximize the value instead of counting combinations
     we use a 2D dp array where dp[i][j] represents the maximum obtainable value for length j using the first i pieces
    we can also optimize this to a 1D dp array, but here we will use a 2D array for clarity
    Time Complexity: O(n*totalLength) and Space Complexity: O(n*totalLength)
    where n is the number of rod pieces and totalLength is the length of the rod         */
    public static int rodCutting(int[] length, int[] price, int totalLength){
        int n=length.length;
        int[][] dp = new int[n+1][totalLength+1];
        //step1:Initialization
        for(int i=0; i<n+1; i++) dp[i][0]=0; //no need to initialize first row and col as java gives 0 by default but it is done for clarity
        //dp[i][0] = 0 as we cannot obtain any value with length 0 and dp[0][j] = 0 as we cannot obtain any value with 0 pieces

        //step2:working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<totalLength+1; j++){
                if(length[i-1]<=j){ //valid case as we can include the rod piece
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                }else{//exclude case as we can't include the rod piece
                    dp[i][j]=dp[i-1][j]; 
                }
            }
        }
        return dp[n][totalLength]; //final answer is at the last cell of the dp array as it stores the maximum obtainable value for the given total length
    }
    public static void main(String[] args){
        int[] length={1,2,3,4,5,6,7,8};
        int[] price={1,5,8,9,10,17,17,20};
        int totalLength=8;
        System.out.println("Maximum obtainable value: "+rodCutting(length,price, totalLength));
    }
}
