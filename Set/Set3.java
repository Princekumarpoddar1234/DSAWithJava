import java.util.*;

public class Set3 {
    public static void main(String[] args){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        for(String city: cities){
            System.out.println(city);
        }
        System.out.println();
        System.out.println("Now using LinkedHashSet");

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        for(String s:lhs){
            System.out.println(s);
        }

    }
}
