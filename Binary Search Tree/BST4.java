import java.util.*;
public class BST4 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node createBST(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=createBST(root.left, val);
        }else{
            root.right=createBST(root.right, val);
        }
        return root;
    }
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static Node createBalancedBST(ArrayList<Integer> arr, int si, int ei){
        if(si>ei) return null;
        int mid=(si+ei)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBalancedBST(arr, si, mid-1);
        root.right=createBalancedBST(arr, mid+1, ei);
        return root;
    }
    public static void main(String[] args){
        int[] values ={8,6,5,3,10,11,12};
        Node root=null;
        for(int val:values){
            root=createBST(root, val);
        }
        preorder(root);
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        root=createBalancedBST(arr, 0, arr.size()-1);
        System.out.println();
        preorder(root);
    }
}
