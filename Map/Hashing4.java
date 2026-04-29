import java.util.*;
public class Hashing4 {
    public static void getMajorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int freq=(arr.length)/3;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>freq){
                System.out.print(entry.getKey()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,5,1,3,1,5,1};
        int[] arr2={1,2};
        getMajorityElement(arr);
        getMajorityElement(arr2);
    }
}
