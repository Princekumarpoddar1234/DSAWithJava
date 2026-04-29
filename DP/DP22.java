public class DP22 {
    //Problem:Generate all combinations of well-formed parentheses
    //This problem is about generating all combinations of well-formed parentheses.
    //We can use a recursive approach to generate the combinations.
    //We will use a character array to store the current combination of parentheses.
    //We will use two variables to keep track of the number of open and close parentheses.
    //We will use a recursive function to generate the combinations.
    //Time Complexity: O(2^n) and Space Complexity: O(n)
    public static void generateParentheses(char[] str, int pos, int n, int open, int close){
        if(close == n){// If we have used all close parentheses, we can print the current combination
            System.out.println(String.valueOf(str));
            return;
        }else{// If we have not used all close parentheses, we can either add a close or an open parenthesis
            if(close < open){// If we have more open parentheses than close, we can add a close parenthesis
                str[pos]=')';
                generateParentheses(str, pos+1, n, open, close+1);
            }
            if(open<n){// If we have not used all open parentheses, we can add an open parenthesis
                str[pos]='(';
                generateParentheses(str,pos+1,n,open+1,close);//
            }
        }
    }
    public static void main(String[] args){
        int n=3;
        char[] str = new char[n*2];
        generateParentheses(str,0,n,0,0);
    }
}
