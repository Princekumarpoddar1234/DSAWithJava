import java.util.*;
public class Set7 {
    public static String getStart(Map<String,String> map){
        HashMap<String,String> rev = new HashMap<>();
        for(String key:map.keySet()){
            rev.put(map.get(key),key);
        }
        for(String key:map.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args){
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai","Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        String start=getStart(map);
        System.out.print(start);
        for(String key: map.keySet()){
            System.out.print("->"+map.get(start));
            start=map.get(start);
        }
    }
}
