import java.util.*;
public class DP2 {
    public static int countWays(int n) {
        if(n == 0) return 1;
        else if(n < 0) return 0;

        return countWays(n - 1)+countWays(n - 2);
    }
    public static int countWaysUsingMemo(int n, int ways[]) {  //O(n)
        if(n == 0) return 1;
        else if(n < 0) return 0;
        if(ways[n] != -1) {
            return ways[n];
        }
        ways[n]=countWaysUsingMemo(n - 1, ways) + countWaysUsingMemo(n - 2, ways);
        return ways[n];

    }
    public static int countWaysUsingTabulation(int n) {  //O(n)
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for(int i=1; i<=n; i++){
            if(i==1){
                dp[i] =  dp[i - 1];
            }else{
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] ways = new int[n + 1];
        Arrays.fill(ways, -1);
        //System.out.println(countWays(n));
        System.out.println(countWaysUsingMemo(n, ways));
        System.out.println(countWaysUsingTabulation(n));
    }
}
