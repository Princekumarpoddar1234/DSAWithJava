public class DP12 {
    public static int lcsForStringConversion(String str1, String str2){
        int n=str1.length(), m=str2.length();
        int[][] dp = new int[n+1][m+1];
        
        //Step1:Initialization
        for(int i=0; i<n+1; i++){//this initializes the first row and first column of the dp array
            for(int j=0; j<m+1; j++){//this is not required as java initializes to 0 by default but done for clarity
                if(i==0) dp[i][j]=j; //if str1 is empty, we need j insertions to form str2
                else if(j==0) dp[i][j]=i; //if str2 is empty, we need i deletions to convert str1 to empty string
                else dp[i][j]=0; //this initializes the rest of the dp array to 0
                if(i==0 || j==0)dp[i][j]=0;
            }
        }
        //Step2: working on dp
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;//we include this character in the LCS
                }else{
                    int ans1=dp[i-1][j];//exclude last character of str1
                    int ans2=dp[i][j-1]; //exclude last character of str2
                    //we have two choices: either exclude the last character of str1 or str2
                    dp[i][j]=Math.max(ans1,ans2);//we take the maximum of both choices we made
                }
            }
        }
        return dp[n][m]; //this is the length of the longest common subsequence which is stored at the last cell of the dp array
    }
    public static void stringConversion(String str1, String str2){
        int z=lcsForStringConversion(str1, str2);//this gives us the length of the longest common subsequence
        //to find the minimum number of operations required to convert str1 into str2
        int insertions=str2.length()-z;//we need to insert characters from str2 that are not in the LCS
        //this gives us the number of insertions required to convert str1 into str2
        int deletions=str1.length()-z;//we need to delete characters from str1 that are not in the LCS
        //this gives us the number of deletions required to convert str1 into str2
        //thus the minimum number of operations required to convert str1 into str2 is the sum of insertions and deletions
        System.out.println("Number of insertion operations and number of delete operations required to convert str1 into str2: "+ insertions +" and "+ deletions +" respectively");
    }
    public static void main(String[] args){
        String str1="abcdef";
        String str2="aceg";
        stringConversion(str1,str2);//using the string conversion method to find the minimum number of operations required to convert str1 into str2
    }
}