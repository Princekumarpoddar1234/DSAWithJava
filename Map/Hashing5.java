import java.util.HashMap;

public class Hashing5 {
    public static boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c: s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        for(Character key:map1.keySet()){
            if(map1.get(key)!=map2.get(key)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s="tulip";
        String t="lipid";
        System.out.println(isAnagram(s, t));

    }
}
