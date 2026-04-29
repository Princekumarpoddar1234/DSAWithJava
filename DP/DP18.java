public class DP18 {
    //this question is about partitioning an array into two subsets such that the difference between their sums is minimized
    //since we have to minimize the difference, we can think of it as a subset sum problem or a knapsack problem where ideal case will be when set sum is half of array sum leading difference to be zero
    //thus we can find the maximum sum we can form with the given items and then find the minimum partitioning by taking the absolute difference between the two sums
    //we will use dynamic programming to solve this problem
    public static int minimumPartitioning(int[] arr){
        int sum=0;
        for(int num:arr) sum+=num;
        int n=arr.length;
        int target=sum/2;
        int[][] dp = new int[n+1][target+1];
        //Step1: Initialization
        for(int i=0; i<n+1; i++){
            dp[i][0]=0;
        }
        for(int j=0; j<target+1; j++){
            dp[0][j]=0; //if no items, we cannot form any positive sum
        }
        //Step2: working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<target+1; j++){
                int val=arr[i-1];
                if(val<=j){
                    int include=val+dp[i-1][j-val];//include the current item
                    int exclude = dp[i-1][j]; //exclude the current item
                    dp[i][j]=Math.max(include, exclude); //take the maximum of both choices
                }else{
                    dp[i][j]=dp[i-1][j]; //if the current item is greater than the target, we cannot include it
                }
            }
        }
        int sum1 =dp[n][target]; //this gives us the maximum sum we can form with the given items to find the minimum partitioning
        int sum2=sum-sum1;
        return Math.abs(sum1-sum2);//the minimum partitioning is the absolute difference between the two sums
        /* time complexity: O(n*target) and space complexity: O(n*target)
        where n is the number of items and target is the maximum sum we can form with the given items
        this is because we are filling the dp array of size n x target
        the nested loops will take O(n*target) time for each i,j pair, thus the overall time complexity is O(n*target)
        space complexity is O(n*target) for the dp array used for tabulation */
    }
    public static void main(String[] args){
        int[] arr={1,6,11,5};
        System.out.println(minimumPartitioning(arr));
    }
}
