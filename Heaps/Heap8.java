import java.util.*;
public class Heap8 {
    public static void main(String[] args){
        int[] ropes={2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost=0;
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            int s=a+b;
            cost+=s;
            pq.add(s);
        }
        System.out.println(cost);
    }
}
