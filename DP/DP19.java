public class DP19 {

    //here we have to check if we can make two sets such that the difference between their sums is zero
    //since we have to tell whether we can partition the array into two subsets with equal sum, we can think of it as a knapsack problem where ideal case will be when set sum is half of array sum leading difference to be zero
    
    public static boolean canPartition(int[] arr){
        int n=arr.length;
        int sum=0;
        for(int num:arr) sum+=num; //calculate the total sum of the array
        if(sum%2!=0) return false; //if the total sum is odd, we cannot partition it into two equal subsets
        int w=sum/2; //we are trying to find if we can form a subset with sum equal to half of the total sum

        int[][] dp = new int[n+1][w+1];
        //Step1: Initialization: since java initializes default with 0 so we don't have to explicitly initialize row 0 and column  with 0
        
        //Step2: working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<w+1; j++){
                if(arr[i-1]<=j){
                    int include=arr[i-1]+dp[i-1][j-arr[i-1]];
                    int exclude=dp[i-1][j];
                    dp[i][j]=Math.max(include, exclude);
                }else{
                    dp[i][j]=dp[i-1][j]; //if the current item is greater than the target, we cannot include it
                }
            }
        }
        int sum1=dp[n][w];
        return sum1==sum/2;
    }
    public static void main(String[] args){
        int[] arr = {1,6,11,5};
        System.out.println(canPartition(arr)); //this will return true if we can partition the array into two subsets with equal sum, otherwise false
    }
}
