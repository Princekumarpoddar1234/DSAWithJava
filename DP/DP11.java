public class DP11 {
    /* Edit Distance Problem Using DP:
    Given two strings, find the minimum number of operations required to convert one string into another, here str1 into str2.
    The operations can be insertion, deletion, or replacement of a character, each cost 1.
    This is a classic dynamic programming problem where we can either include or exclude a character to minimize the edit distance.
    we use a 2D dp array where dp[i][j] represents the minimum edit distance between the first i characters of str1 and the first j characters of str2
    Time Complexity: O(n*m) and Space Complexity: O(n*m)
    where n is the length of str1 and m is the length of str2
    */
    public static int editDistance(String str1, String str2){
        int n=str1.length();
        int m=str2.length();
        int[][] dp = new int[n+1][m+1];
        //Step1:Initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0)dp[i][j]=j;
                else if(j==0) dp[i][j]=i;
            }
        }
        //Step2: table computation | Bottom up Approach
        for(int i=1; i<n+1;i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){//valid case as characters match
                    //we do not need to do anything, so the edit distance remains the same as it was for the previous characters
                    //thus we take the value from the previous row and previous column
                    dp[i][j]=dp[i-1][j-1];
                }else{//exclude case as characters do not match
                    //we have three choices to make:
                    int add=dp[i][j-1]+1;//when we add a character to str1 then we have to increase the edit distance and we then have to check for match of same character of str1 but now with next character of str2 therefore we move to previous row and same column
                    int delete=dp[i-1][j]+1;//when we remove a character from str1 then we have to increase the edit distance and we then have to check for match of same character of str1 but now with previous character of str2 therefore we move to same row and previous column
                    int update=dp[i-1][j-1]+1;//when we replace a character of str1 with a character of str2 then we have to increase the edit distance and we then have to check for match of same character of str1 but now with previous character of str2 therefore we move to previous row and previous column
                    dp[i][j]=Math.min(add, Math.min(delete,update));//we take the minimum of all three choices we made
                }
            }
        }
        return dp[n][m];//this is the final answer which is the edit distance between str1 and str2 stored at the last cell of the dp array
    }
    public static void main(String[] args){
        String str1="intention";
        String str2="execution";
        System.out.println(editDistance(str1,str2));
    }
}
