import java.util.*;
public class BinaryTree5 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.right=this.left=null;
        }
    }
    
    public static Node treeFormation(int[] nodes, int[] idx){
        //idx++;
        if(idx[0]>=nodes.length || nodes[idx[0]]==-1){
            idx[0]++;
            return null;
        }
        Node newNode=new Node(nodes[idx[0]++]);
        newNode.left=treeFormation(nodes,idx);
        newNode.right=treeFormation(nodes,idx);

        return newNode;
    }
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();

            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    
    public static boolean isSubtree(Node root, Node subRoot){
        if(root==null) return false;

        if(root.data==subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot)||isSubtree(root.right, subRoot);
    }
    public static boolean isIdentical(Node node, Node subRoot){
        if(node==null && subRoot==null) return true;
        else if(node==null || subRoot==null || node.data!=subRoot.data){
            return false;
        }
        if(!isIdentical(node.left, subRoot.left)) return false;

        if(!isIdentical(node.right,subRoot.right)) return false;

        return true;
    }
    public static void main(String[] args){
        int[] nodes1={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes2={2,4,-1,-1,5,-1,-1};
        Node root1=treeFormation(nodes1,new int[]{0});
        Node root2=treeFormation(nodes2,new int[]{0});
        System.out.println("Tree Traversal");
        levelOrder(root1);
        System.out.println("SubTree Traversal");
        levelOrder(root2);

        System.out.println(isSubtree(root1, root2));
    }
}
