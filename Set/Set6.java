import java.util.*;
public class Set6 {
    public static void main(String[] args){
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        
        for(int a:arr1){
            set.add(a);
        }
        for(int a:arr2){
            set.add(a);
        }
        System.out.println("union:"+set);
        LinkedHashSet<Integer> t = new LinkedHashSet<>();
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        for(int a:arr1){
            t.add(a);
        }
        for(int a:arr2){
            if(t.contains(a)) intersection.add(a);
        }
        
        
        System.out.println("Intersection:"+intersection);
    }
}