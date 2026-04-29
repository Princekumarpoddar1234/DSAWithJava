import java.util.*;
public class Hashing6 {
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char c:t.toCharArray()){
            if(map.get(c)!=null){
                if(map.get(c)==1){
                    map.remove(c);
                }else{
                    map.put(c,map.get(c)-1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="care";
        String t="race";
        System.out.println(isAnagram(s,t));
    }
}
