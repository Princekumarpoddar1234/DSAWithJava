public class linkedlist6 {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"<->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static int removeFirst(){
        if(head==null){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int result = head.data;
        size--;
        head=head.next;
        head.prev=null;
        return result;
    }
    public void reverse(){
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            // Swap next and prev for current node
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            // Move to next node (which is previous before swap)
            curr = curr.prev;
        }
        // After the loop, temp will be at the old head's prev, so update head and tail
        if (temp != null) {
            head = temp.prev;
            // Update tail as well
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            tail = t;
        }
    }
    public static void main(String args[]){
        linkedlist6 ll = new linkedlist6();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println(size);
        // System.out.println("we have deleted "+ll.removeFirst());
        // ll.print();
        // System.out.println(ll.size);
        ll.reverse();
        ll.print();
        ll.reverse();
    }
}
