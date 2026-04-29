public class BST1{
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
        }
    }
    public static Node treeFormation(Node root, int data){
        //if null
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(root.data>data){
            root.left=treeFormation(root.left, data);
        }else if(root.data<data){
            root.right=treeFormation(root.right, data);
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
    public static boolean search(Node root, int key){
        //if null
        if(root==null){
            return false;
        }
        //if found
        if(root.data==key){
            return true;
        }
        //if smaller than root
        if(root.data>key){
            return search(root.left,key);
        }else{//if greater than root
            return search(root.right,key);
        }
    }
    public static Node delete(Node root, int key){
        if(root.data<key){
            root.right=delete(root.right, key);
        }else if(root.data>key){
            root.left=delete(root.left, key);
        }else{//found
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                Node IS=inorderSuccessor(root.right);
                root.data=IS.data;
                root.right=delete(root.right, IS.data);
            }
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        //int[] values={5,1,3,4,2,7}; cause at a time we can insert only one array elements
        int[] values2={8,5,3,6,1,4,10,11,14};
        Node root=null;
        for(int i=0; i<values2.length; i++){
            root=treeFormation(root,values2[i]);
        }
        inorder(root);
         System.out.println();
        // if(search(root,1)){
        //     System.out.println("element found");
        // }else{
        //     System.out.println("element not found");
        // }
        root=delete(root, 6);
        inorder(root);
    }
}