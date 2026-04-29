public class DP21 {
    public static void tribonacci(int n){
        int[] dp = new int[n+1];
        dp[0]=dp[1]=0;
        dp[2]=1;
        for(int i=3; i<=n; i++){
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
        for(int d:dp){
            System.out.print(d+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int n=5;
        tribonacci(n);
    }
}
