import java.util.*;
public class DP17 {
    public static int mcmRec(int[] arr, int i, int j){
        //recursion intuition:
        //if only one matrix, no cost to multiply
        //if more than one matrix, we need to find the minimum cost of multiplying matrices from index i to j
        //we can split the matrices at any point k between i and j and calculate the cost of multiplying the two resulting subarrays
        //we then take the minimum cost of all possible splits

        
        if(i==j) return 0; //if only one matrix, no cost to multpily

        int minCost=Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int cost1=mcmRec(arr,i,k); //cost of multiplying matrices from index i to k
            int cost2=mcmRec(arr,k+1,j); //cost of multiplying matrices from index k+1 to j
            int cost3=arr[i-1] * arr[k] * arr[j]; //cost of multiplying the two matrices
            int totalCost=cost1 + cost2 + cost3; //total cost of multiplying matrices from index i to j with split at k
            minCost = Math.min(minCost , totalCost); //take the minimum cost of all possible splits
        }
        return minCost; //return the minimum cost of multiplying matrices from index i to j
    }
    public static int mcmMemo(int[] arr, int i, int j, int[][] dp){
        if(i==j) return 0;

        if(dp[i][j]!=-1) return dp[i][j]; //if already computed, return the stored value

        int minCost = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int cost1=mcmMemo(arr,i,k,dp); //cost of multiplying matrices from index i to k
            int cost2=mcmMemo(arr,k+1,j,dp); //cost of multiplying matrices from index k+1 to j
            int cost3=arr[i-1] * arr[k] * arr[j]; //cost of multiplying the two matrices
            int totalCost = cost1 + cost2 + cost3; //total cost of multiplying matrices from index i to j with split at k
            minCost = Math.min(minCost, totalCost); //take the minimum cost of all possible splits
        }
        return dp[i][j]=minCost; //store the computed value in dp array and return it
        /*        time complexity: O(n^3) and space complexity: O(n^2) for memoization
        this is because we are computing the value for each i,j pair only once and storing it in the dp array
        the recursive calls will take O(n) time for each i,j pair, thus the overall time complexity is O(n^3)
        space complexity is O(n^2) for the dp array used for memoization */
    }
    public static int mcmTabulation(int[] arr){
        int n=arr.length;
        // Step1: Initialization
        //we will use a 2D dp array where dp[i][j] represents the minimum cost of multiplying matrices from index i to j
        //we will initialize the diagonal elements to 0 as if only one matrix, no cost to multiply
        //we will also initialize the rest of the elements to Integer.MAX_VALUE as we will be finding the minimum cost
        //we will use 1-based indexing for the dp array, so we will create a dp array of size n x n

        //Note: Lower triangular part of the dp array will not be used as we are only interested in the upper triangular part where i < j
        //since we are multiplying matrices from index i to j, we will only fill the upper triangular part of the dp array



        int[][] dp = new int[n][n];
        for(int i=0; i<n; i++){
            dp[i][i]=0; //if only one matrix, no cost to multiplu
        }
        //Step2: Working on dp
        for(int len=2; len<=n-1; len++){ //len is the length of the subarray we are considering
            for(int i=1; i<=n-len; i++){ //i is the starting index of the subarray of length len
                int j=i+len-1; //j is the end index of the subarray of length len starting from i
                dp[i][j]=Integer.MAX_VALUE; //initialize to maximum value
                for(int k=i; k<j; k++){
                    int cost1=dp[i][k]; //cost of multiplying matrices from index i to k
                    int cost2=dp[k+1][j]; //cost of multiplying matrices from index k+1 to j
                    int cost3=arr[i-1] * arr[k] * arr[j]; //cost of multiplying the two matrices
                    int totalCost = cost1 + cost2 + cost3; //total cost of multiplying matrices from index i to j with split at k
                    dp[i][j]=Math.min(dp[i][j], totalCost); //take the minimum cost of all possible splits
                }
            }
        }

        //just to see the dp array
        printTable(dp);
        return dp[1][n-1]; //return the minimum cost of multiplyig matrices from index 1 to n-1
        /* time complexity: O(n^3) and space complexity: O(n^2)
        this is because we are computing the value for each i,j pair only once and storing it in the dp array
        the nested loops will take O(n^2) time for each i,j pair, thus the overall time complexity is O(n^3)
        space complexity is O(n^2) for the dp array used for tabulation */
    }
    public static void printTable(int[][] dp){
        for(int i=0; i<dp.length; i++){
            for(int data: dp[i]){
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3};
        System.out.println(mcmRec(arr,1,arr.length-1));
        //This will give us the minimum cost of multiplying the matrices from index 1 to n
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        System.out.println("Using Memoization: "+mcmMemo(arr,1,arr.length-1,dp));//using memoization to find the minimum cost of multiplying matrices
        //This will give us the minimum cost of multiplying the matrices from index 1 to n
        System.out.println("Using Tabulation: "+mcmTabulation(arr));//using tabulation to find the minimum cost of multiplying matrices
        //This will give us the minimum cost of multiplying the matrices from index 1 to n
    }
}