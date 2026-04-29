public class DP16 {
    //explain the problem statement
    /* Mountain Ranges Problem Using DP:
    Given n pairs of ups and down strokes, find the number of mountain ranges that can be formed.
    A mountain range is defined as a sequence of ups and downs that starts and ends at the same level, with at least one up and one down stroke.
    This is a classic dynamic programming problem where we can either include or exclude a character to check for a match.
    We use a 1D dp array where dp[i] represents the number of mountain ranges that can be formed with i pairs of ups and down strokes. */
    //This is similar to the Catalan number problem, where we can use dynamic programming to find the number of valid mountain ranges.

    public static int mountainRanges(int n){  //time complexity: O(n^2) and space complexity: O(n)
        int[] dp = new int[n+1];
        dp[0]=dp[1]=1; //base case as for n=0, n=1 there is only one way to form a mountain range

        for(int i=2; i<=n; i++){
            for(int j=0; j<=i-1; j++){
                int canBeInside=dp[j];
                int canBeOutside = dp[i-1-j];
                dp[i] += canBeInside * canBeOutside;
                /* C(n) = Σ (C(i) * C(n-i-1)) for i=0 to n-1
                where C(0) = 1 and C(1) = 1.   */
            }
        }
        return dp[n]; //return the count of mountain ranges that can be formed with n pairs of ups and down strokes
    }
    public static void main(String[] args){
        int n=4;
        System.out.println("Number of mountain ranges that can be formed with " + n + " pairs of ups and down strokes: " + mountainRanges(n));
        //This will give us the number of mountain ranges that can be formed with n pairs of ups and down strokes
    }
}
