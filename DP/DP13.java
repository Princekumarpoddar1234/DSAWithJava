public class DP13 {
    /* Problem: Wildcard Matching Problem Using DP:
    Given a string s and a pattern p, where p can contain '?' (which matches any single character) and '*' (which matches any sequence of characters, including the empty sequence), determine if s matches p.
    This is a classic dynamic programming problem where we can either include or exclude a character to check for a match.
    We use a 2D dp array where dp[i][j] represents whether the first i characters of s match the first j characters of p.
    Time Complexity: O(n*m) and Space Complexity: O(n*m)
    where n is the length of s and m is the length of p
    

    Intuition:
    /* The idea is to fill the dp array based on the following rules:
    1. If the characters match or if the pattern character is '?', we can take the value from the previous row and previous column.
    2. If the pattern character is '*', we can either consider it as empty (dp[i][j-1]) or as one or more characters (dp[i-1][j]).
    3. If the characters do not match and the pattern character is not '?' or '*', we cannot match, so we set dp[i][j] to false.
    4. If the string is empty, the pattern can only match if it contains only '*' characters.
    5. If the pattern is empty, the string cannot match unless it is also empty.

    Approach:
    We initialize the dp array with false values and set dp[0][0] to true, as an empty string matches an empty pattern.
    We then fill the dp array based on the above mentioned rules. The final answer will be stored in dp[n][m], where n is the length of s and m is the length of p.
    */
    public static boolean wildcardMatching(String s, String p){
        int n=s.length();
        int m=p.length();

        boolean[][] dp = new boolean[n+1][m+1];

        /*  Naive Initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if(i==0 && j==0) dp[i][j]=true;
                if(j==0) dp[i][0]=false; //if pattern is empty, string cannot match
                if(i==0){
                    //if string is empty, pattern can only match if it contains only '*' characters
                    boolean allStars=true;
                    for(int k=0; k<j; k++){
                        if(p.charAt(k)!='*'){
                            allStars=false;
                            break;
                        }
                    }
                    dp[0][j]=allStars; //if all characters in pattern are '*', then it can match an empty string
                }
            }
        } */

        //Step1: Initialization
        dp[0][0]=true; //an empty string matches an empty pattern
        for(int i=1; i<n+1; i++){//column zero initialization
            dp[i][0]=false; //an empty pattern cannot match a non-empty string
        }
        for(int j=1; j<m+1; j++){//row zero initialization
            if(p.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }//otherwise, dp[0][j] remains false as an empty string cannot match a non-empty pattern unless it is all '*' and we don't need to initialize it explicitly as Java initializes boolean arrays to false by default
        }

        //Step2: Working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    boolean ans1=dp[i][j-1]; //consider '*' as empty
                    boolean ans2=dp[i-1][j]; //consider '*' as one or more characters
                    dp[i][j]=ans1 || ans2; //if either of the two conditions is true, then we can match
                }else{
                    dp[i][j]=false; //if characters do not match and pattern is not '?' or '*', then we cannot match
                }
            }
        }
        return dp[n][m]; //final answer is stored at the last cell of the dp array
    }
    public static void main(String[] args){
        String s1="baaabab";
        String p1="*****ba*****ab";
        System.out.println(wildcardMatching(s1,p1)); //true

        String s2="baaabab";
        String p2="a*ab";
        System.out.println(wildcardMatching(s2, p2)); //false
    }
}