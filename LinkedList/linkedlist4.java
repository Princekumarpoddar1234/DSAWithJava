// import java.util.LinkedList;
public class linkedlist4 {
    public static class Node{
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

    public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp=mergedLL;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedLL.next;
    }
    public static Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid =getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);//left MergeSort
        Node newRight=mergeSort(rightHead);//right MergeSort

        //merge
        return merge(newLeft, newRight);
    }
    public static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        Node head=new Node(3);
        head.next=new Node(8);
        head.next.next= new Node(6);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next=new Node(2);
        print(head);
        mergeSort(head);
        print(head);

    }
}
