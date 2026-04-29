import java.util.*;
public class BST2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node create(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=create(root.left,val);
        }else if(root.data<val){
            root.right=create(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printInRange(Node root, int k1, int k2){
        if(root==null) return;

        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data<k1){
            printInRange(root.left, k1, k2);
        }else{
            printInRange(root.right, k1, k2);
        }
    }
    public static void printPath(ArrayList<Integer> path){
        for(int n:path){
            System.out.print(n+"->");
        }
        System.out.println("null");
    }
    public static void printRootToLeaf(Node root, ArrayList<Integer> path){
        //if root is null
        if(root==null) return;

        //add root.data to path
        path.add(root.data);

        //if we reach leaf node then print the path
        if(root.left==null && root.right==null){
            printPath(path);
        }

        //call for left subtree
        printRootToLeaf(root.left, path);

        //call for right subtree
        printRootToLeaf(root.right, path);

        //remove root.data from path
        path.remove(path.size()-1);
    }
    public static boolean isValidBST(Node root, Node min, Node max){
        if(root==null) return true;

        if(min!=null && root.data<=min.data) return false;
        else if(max!=null && root.data>=max.data) return false;

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }
    public static Node mirror(Node root){
        if(root==null) return null;
        Node leftS=mirror(root.left);
        Node rightS=mirror(root.right);

        root.left=rightS;
        root.right=leftS;

        return root;
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        int[] values1={8,5,3,1,4,6,10,11,14};
        //int[] values2={8,5,3,6,10,11,14};
        //int[] values3={1,1,1};
        Node root=null;
        for(int value:values1){
            root=create(root,value);
        }
        // inorder(root);
        // System.out.println();

        // System.out.print("Print using Range: ");
        // printInRange(root, 05, 11);
        // System.out.println();
        // printRootToLeaf(root, new ArrayList<>());
        
        // System.out.println(isValidBST(root,null,null));

        preorder(root);
        System.out.println();
        mirror(root);
        preorder(root);
    }
}
