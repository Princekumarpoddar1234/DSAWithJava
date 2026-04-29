import java.util.LinkedList;
public class linkedlist3 {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        //0->2->1

        System.out.println(ll);

        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
