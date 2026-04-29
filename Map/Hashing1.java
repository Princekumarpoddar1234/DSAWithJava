import java.util.HashMap;
public class Hashing1 {
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();

        //insert
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        // System.out.println(hm);//unordered map
        // System.out.println(hm.get("India"));
        // System.out.println(hm.get("Indonesia"));
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        //hm.remove("China");
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);
    }
}
