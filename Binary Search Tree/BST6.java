import java.util.*;
public class BST6 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.right=this.left=null;
        }
    }
    public static ArrayList<Integer> mergeArray(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        int i=0,j=0;
        ArrayList<Integer> merged = new ArrayList<>();
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                merged.add(arr1.get(i++));
            }else{
                merged.add(arr2.get(j++));
            }
        }
        while(i<arr1.size()){
            merged.add(arr1.get(i));
        }
        while(j<arr2.size()){
            merged.add(arr2.get(j++));
        }
        return merged;
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root==null) return;

        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static Node createBST(ArrayList<Integer> arr,int si, int ei){
        if(si>ei) return null;
        int mid=si+(ei-si)/2;
        Node root= new Node(arr.get(mid));
        root.left=createBST(arr, si, mid-1);
        root.right=createBST(arr, mid+1, ei);

        return root;
    }
    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        inorder(root1, arr1);
        inorder(root2, arr2);

        ArrayList<Integer> merged = new ArrayList<>();
        merged=mergeArray(arr1, arr2);

        return createBST(merged, 0, merged.size()-1);
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        Node root1 = new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2 = new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);

        Node root=mergeBST(root1,root2);
        preorder(root);
    }
}
