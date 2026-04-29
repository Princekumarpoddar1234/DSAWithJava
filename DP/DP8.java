public class DP8 {
    /* Longest Common Subsequence Problem Using DP
    given two strings, find the length of the longest subsequence present in both strings
    a subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements
    this is a classic dynamic programming problem where we can either include or exclude a character to maximize the length of the common subsequence      */
    public static int lcs(String str1, String str2, int n, int m){//using recursion
        //base case
        if(n==0 ||m==0) return 0;

        if(str1.charAt(n-1)==str2.charAt(m-1)){//if characters match, we include this character in the LCS
            return lcs(str1,str2,n-1,m-1)+1;
        }else{//if characters do not match, we have two choices: either exclude the last character of str1 or str2
            int ans1=lcs(str1,str2,n-1,m);
            int ans2=lcs(str1,str2,n,m-1);
            return Math.max(ans1,ans2);
        }
    }
    public static int lcsMemo(String str1, String str2, int n, int m, int[][] dp){
        if(n==0 ||m==0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];

        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return dp[n][m]=lcsMemo(str1,str2,n-1,m-1,dp)+1;
        }else{
            int ans1=lcsMemo(str1,str2,n-1,m,dp);
            int ans2=lcsMemo(str1,str2,n,m-1,dp);
            return dp[n][m]=Math.max(ans1,ans2);
        }
    }
    public static int lcsTabulation(String str1, String str2){
        int n=str1.length(), m=str2.length();
        int[][] dp = new int[n+1][m+1];
        //step1:Initialization
        for(int i=0; i<n+1; i++) dp[i][0]=0; //if str2 is empty, LCS is 0
        for(int j=0; j<m+1; j++) dp[0][j]=0; //if str1 is empty, LCS is 0  | well, this is not needed as java initializes to 0 by default but done for clarity

        //step2:working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1; //if characters match, we include this character in the LCS
                }else{
                    int ans1=dp[i-1][j]; //exclude last character of str1
                    int ans2=dp[i][j-1]; //exclude last character of str2
                    dp[i][j]=Math.max(ans1,ans2); //take the maximum of both choices
                }
            }
        }
        return dp[n][m]; //final answer is at the last cell of the dp array as it stores the length of the longest common subsequence
    }
    public static void main(String[] args){
        String str1="abcde";
        String str2="ace";
        int n=str1.length(),m=str2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                dp[i][j]=-1;
            }
        }
        System.out.println("Using Recursion: "+lcs(str1,str2,n,m));//using recursion
        System.out.println("Using Memoization: "+lcsMemo(str1,str2,n,m,dp));//using memoization
        System.out.println("Using Tabulation: "+lcsTabulation(str1,str2));//using tabulation
    }
}