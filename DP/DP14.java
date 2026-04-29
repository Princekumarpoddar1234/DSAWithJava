import java.util.*;
public class DP14 {
    public static int catalanRec(int n){
        if(n==0 || n==1) return 1; //base case as for n=0 and n=1, they are both 1

        int ans=0;
        for(int i=0; i<=n-1; i++){
            ans+=catalanRec(i) * catalanRec(n-i-1); //this is the recursive formula for catalan numbers
            /* C(n) = Σ (C(i) * C(n-i-1)) for i=0 to n-1
            where C(0) = 1 and C(1) = 1.  */
        }
        return ans;
    }
    public static int catalanMemo(int n, int[] dp){
        if(n==0 || n==1) return 1; //base case
        if(dp[n]!=-1) return dp[n]; //if already computed, return the stored value

        int ans=0;
        for(int i=0; i<n; i++){
            ans+=catalanMemo(i,dp)*catalanMemo(n-i-1,dp);
        }
        return dp[n]=ans; 
        /*store the computed value in dp array
        time complexity: O(n^2) and space complexity: O(n) for memoization
        this is because we are computing the value for each n only once and storing it in the dp array
        the recursive calls will take O(n) time for each n, thus the overall time complexity is O(n^2)
        space complexity is O(n) for the dp array used for memoization      */
    }
    public static int catalanTabulation(int n){ //Time Complexity: O(n^2) and Space Complexity: O(n) for both
        int[] dp = new int[n+1];
        dp[0]=dp[1]=1; //base cases
        for(int i=2; i<=n; i++){
            for(int j=0; j<=i-1; j++){
                dp[i]+=dp[j] * dp[i-j-1]; //using the previously computed values to find the current value
            }
        }
        return dp[n]; //return the nth catalan number
    }
    public static void main(String[] args){
        int n=5; //example input for nth catalan number
        //System.out.println("Using Recursion: "+catalanRec(n));//using recursion to find the nth catalan number
        //Note: This approach has exponential time complexity and is not efficient for larger values of n

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1); //initializing dp array with -1 for memoization
        System.out.println("Using Memoization: "+catalanMemo(n,dp)); //using memoization to find the nth catalan number
        System.out.println("Using Tabulation: "+catalanTabulation(n)); //using tabulation to find the nth catalan number
        //Note: Tabulation is more efficient than memoization for larger values of n as it avoids the overhead of recursive calls

    }
}

    /* 
    Catalan numbers are a sequence of natural numbers that have many applications in combinatorial mathematics.
    The nth Catalan number can be defined using the formula:
    C(n) = (2n)! / ((n+1)! * n!)
    or recursively as:
    C(n) = Σ (C(i) * C(n-i-1)) for i=0 to n-1
    where C(0) = 1 and C(1) = 1.
    
    The recursive approach is not efficient for larger values of n due to its exponential time complexity.
    A more efficient approach would be to use dynamic programming or memoization to store previously computed values.
    */

    /* 
    Catalan numbers have many applications in combinatorial problems such as counting the number of valid parentheses combinations, counting the number of rooted binary trees with n nodes, and many more.
    The nth Catalan number can also be computed using dynamic programming or using the binomial coefficient formula.
    */