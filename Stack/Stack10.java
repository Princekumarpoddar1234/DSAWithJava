import java.util.*;
public class Stack10 {
    public static boolean isDuplicate(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            if(curr!=')'){
                s.push(curr);
            }else{
                int count=0;
                while(!s.isEmpty() && s.pop()!='('){
                    // s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str1="(((a+(b)))+(c+d))";
        String str2="((a+b)+(c+d))";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}