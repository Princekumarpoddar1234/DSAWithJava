import java.util.*;
public class BinaryTree8 {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data=data;
            this.right=this.left=null;
        }
    }
    public static Node createTree(int[] nodes, int[] idx){
        if(nodes[idx[0]]==-1){
            idx[0]++;
            return null;
        }
        Node newNode = new Node(nodes[idx[0]++]);
        newNode.left=createTree(nodes,idx);
        newNode.right=createTree(nodes,idx);

        return newNode;
    }
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        /*       if root =null then false, otherwise add the root and check if left or right sides matches,
        then return true, else remove that last node and return false              */
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }
        boolean leftP=getPath(root.left,n,path);
        boolean rightP=getPath(root.right,n,path);
        if(leftP||rightP){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root, int n1, int n2){//O(n) time complexity
        ArrayList<Node> path1= new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }
    public static Node LCA(Node root, int n1, int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca=LCA(root.left,n1,n2);
        Node rightLca=LCA(root.right,n1,n2);
        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }
        return root;
    }
    public static void main(String[] args){
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(nodes, new int[]{0});
        
        Node lc2=LCA(root,4,6);
        Node lc1=lca(root,4,5);
        System.out.println(lc1.data);
        System.out.println(lc2.data);
    }
}
