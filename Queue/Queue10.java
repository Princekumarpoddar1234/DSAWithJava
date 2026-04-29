import java.util.*;
public class Queue10 {
    public static void main(String[] args){
        //Deque<Integer> deque = new LinkedList<>(Arrays.asList(1,2,3));
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); //2,1
        deque.addLast(3); //2,1,3
        deque.addFirst(4); // 4,2,1,3
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);

    }
}
