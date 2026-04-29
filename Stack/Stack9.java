import java.util.*;
public class Stack9 {
    public static boolean isValidParentheses(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0; i<str.length(); i++){
            char curr=str.charAt(i);
            if(curr=='(' || curr=='[' || curr=='{'){
                s.push(curr);
            }else{
                if(s.isEmpty()){
                    return false;
                }else{
                    char top=s.pop();
                    if(top=='(' && curr!=')' || top=='[' && curr!=']' || top=='{' && curr!='}'){
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args){
        String str ="(()[]{})";
        System.out.println(isValidParentheses(str));
    }
}
