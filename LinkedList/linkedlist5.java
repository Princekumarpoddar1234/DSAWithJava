public class linkedlist5 {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head1){
        Node curr=head1;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void zigzag(Node head){
        Node mid=getMid(head);
        Node right=reverse(mid.next);
        mid.next=null;
        Node left=head;

        while(left!=null && right!=null){
            Node nextL=left.next;
            Node nextR=right.next;

            left.next=right;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        linkedlist5 ll = new linkedlist5();
        Node head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next = ll.new Node(4);
        head.next.next.next.next=ll.new Node(5);
        head.next.next.next.next.next=ll.new Node(6);
        print(head);
        zigzag(head);
        print(head);

    }
}
