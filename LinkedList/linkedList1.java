//linkedlist tutorials code:
//This file contains the implementation of a singly linked list with various operations such as adding, removing, searching, reversing, and checking for palindromes.
//It also includes methods for checking if the linked list has a cycle and deleting the nth node from the end.
//This implementation uses a Node class to represent each element in the linked list, and the linked list itself is managed through head, tail, and size variables.
//The main method demonstrates the usage of these methods by creating a linked list, adding elements, removing elements, and printing the linked list at various stages.

public class linkedList1 {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LinkedList is Empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            size=0;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }
    public void print(){
        if(head==null){
            System.out.println("LinkedList is Empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int iterativeSearch(int key){
        Node temp = head;
        int i=0;
        
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void reverse(){
        Node current =tail= head;
        Node prev=null;
        Node next;
        while(current!=null){
            next=current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head=prev;
    }
    public void deleteNthNodeFromEnd(int n){
        int sz=0;
        Node current=head;
        while(current!=null){
            sz++;
            current=current.next;
        }
        if(n==size){
            head=head.next;//remove1stOp
            return;
        }
        int i=1;
        int iToFind=sz-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        //base case
        if(head==null || head.next==null) return true;
        //find mid
        Node midNode = findMid(head);
        //reverse second half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//half head
        Node left=head;//left head

        while(right!=null){
            if(left.data!=right.data) return false;

            left=left.next;
            right=right.next;
        }
        return true;

        //check first and second half
    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){//cycble found
                return true;
            }
        }
        return false;//no cycle found
    }


    public static void main(String args[]){
        linkedList1 ll = new linkedList1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        ll.print();
        ll.deleteNthNodeFromEnd(3);
        ll.print();


        System.out.println(ll.removeFirst());

        ll.print();
        //System.out.println(ll.size);
        System.out.println(ll.removeLast());
        //System.out.println(ll.size);
        ll.print();
        System.out.println(ll.recSearch(4));
        ll.reverse();
        ll.print();


        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());

        head=ll.new Node(1);
        head.next=ll.new Node(2);
        head.next.next=ll.new Node(3);
        head.next.next.next=head.next;
        // 1->2->3

        System.out.println(isCycle());

    }
}

