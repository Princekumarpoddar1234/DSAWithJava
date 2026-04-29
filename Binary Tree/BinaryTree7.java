import java.util.*;
public class BinaryTree7 {
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node createTree(int[] nodes, int[] idx){//create tree
        if(nodes[idx[0]]==-1){
            idx[0]++;
            return null;
        }
        Node newNode=new Node(nodes[idx[0]++]);
        newNode.left=createTree(nodes,idx);
        newNode.right=createTree(nodes,idx);

        return newNode;
    }
    public static void levelOrderTraversal(Node root, int k){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(k==1){
                if(curr==null){
                    System.out.println();
                }else{
                    System.out.print(curr.data+" ");
                }
            }
            
            if(curr==null){
                
                if(q.isEmpty()){
                    break;
                }else{
                    k--;
                    q.add(null);
                }
            }else{
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void kLevel(Node root, int level, int k){
        if(root==null){
            return;//no need to go further if it is already null
        }
        if(level==k){
            System.out.print(root.data+" ");
            return;//we don't need to go further for its child
        }
        kLevel(root.left,level+1,k);
        kLevel(root.right,level+1,k);
    }
    public static void main(String[] args){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root=createTree(nodes, new int[]{0});
        levelOrderTraversal(root, 3);
        kLevel(root,1,2);
    }
}
