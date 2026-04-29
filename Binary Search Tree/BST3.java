public class BST3 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBST(int[] arr, int si, int ei){
        if(si>ei) return null;

        int mid=(si+ei)/2;
        Node root= new Node(arr[mid]);
        root.left=createBST(arr,si,mid-1);
        root.right=createBST(arr,mid+1,ei);

        return root;
    }
    public static void main(String[] args){
        //Node root=null;
        int[] values = {3,5,6,8,10,11,12};
        Node root=createBST(values,0,6);
        preorder(root);
        System.out.println();
    }
}