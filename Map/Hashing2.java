import java.util.*;
public class Hashing2 {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("US",50);
        map.put("Nepal",5);
        map.put("Indonesia",6);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        // for(String str:keys){
        //     System.out.println("key="+str+","+"value="+map.get(str));
        // }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
