public class DP9 {
    /* Longest Common Substring Problem Using DP
    given two strings, find the length of the longest substring present in both strings
    a substring is a contiguous sequence of characters within a string
    this is a classic dynamic programming problem where we can either include or exclude a character to maximize the length of the common substring
    we use a 2D dp array where dp[i][j] represents the length of the longest common substring ending at str1[i-1] and str2[j-1] */
    //Time Complexity: O(n*m) and Space Complexity: O(n*m)

    public static int longestCommonSubstring(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int[][] dp = new int[n+1][m+1];
        //step1:Initialization
        for(int i=0; i<n+1; i++) dp[i][0]=0; //if str2 is empty, LCS is 0
        for(int j=0; j<m; j++) dp[0][j]=0; //if str1 is empty, LCS is 0 | well, these two lines are not needed as java initializes to 0 by default but done for clarity

        int maxLength=0; //to keep track of the maximum length of common substring found
        //step2:working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){//if characters match, we include this character in the common substring
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=0;
                }
                maxLength=Math.max(maxLength,dp[i][j]); //update maxLength if we found a longer common substring
                //we do not need to check for the maximum of both choices as in LCS,
            }
        }
        return maxLength; //final answer is the maximum length of common substring found, it is unlike d[n][m] in LCS as we are looking for the length of the longest common substring, not subsequence
    }
    public static void main(String[] args){
        String str1="ABCDE";
        String str2="ABGCE";
        System.out.println("Longest Common Substring Using Tabulation: "+longestCommonSubstring(str1,str2));
    }
}
