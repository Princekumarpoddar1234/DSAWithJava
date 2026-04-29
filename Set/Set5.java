import java.util.*;
public class Set5 {
    public static void main(String[] args){
        int[] nums ={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        System.out.println(set.size());
    }
}
