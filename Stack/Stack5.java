import java.util.*;
public class Stack5 {
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();
        String s="Hello";
        for(char c: s.toCharArray()){
            st.push(c);
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        System.out.println(str.toString());
    }
}
