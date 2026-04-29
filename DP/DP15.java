public class DP15 {
    /*
 * Problem: Count Unique Binary Search Trees (BSTs) using Catalan Numbers
 * Catalan numbers are a sequence of natural numbers that have many applications in combinatorial mathematics.
 * The nth Catalan number can be defined using the formula:
 * C(n) = (2n)! / ((n+1)! * n!)
 * or recursively as:
 * C(n) = Σ (C(i) * C(n-i-1)) for i=0 to n-1
 * where C(0) = 1 and C(1) = 1.
 * 
 */
    public static int countBST(int n){ //time complexity: O(n^2) and space complexity: O(n)
        int[] dp = new int[n+1];
        dp[0]=dp[1]=1; //base cases as for n=0 and n=1, there is only one unique BST that can be formed
        for(int i=2; i<=n; i++){
            for(int j=0; j<=i-1; j++){
                int left = dp[j]; //number of unique BSTs that can be formed with j nodes on the left
                //the remaining (i-1-j) nodes will be on the right
                int right= dp[i-1-j]; //number of unique BSTs that can be formed with (i-1-j) nodes on the right
                //the total number of unique BSTs that can be formed with i nodes is the product
                dp[i] += left * right;
                /* C(n) = Σ (C(i) * C(n-i-1)) for i=0 to n-1
                where C(0) = 1 and C(1) = 1.   */
            }
        }
        return dp[n]; //return the nth catalan number

    }
    public static void main(String[] args){
        int n=4;
        System.out.println("Number of unique BSTs that can be formed with "+ n  + " nodes: " + countBST(n));
        //This will give us the number of unique BSTs that can be formed with n nodes
    }
}