import java.util.*;
public class BinaryTree4 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node createTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=createTree(nodes);
            newNode.right=createTree(nodes);
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
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);

            return Math.max(lh,rh)+1;
        }
        public static int diameter(Node root){//O(n^2)
            if(root==null){
                return 0;
            }
            int lDia=diameter(root.left);
            int lH=height(root.left);

            int rDia=diameter(root.right);
            int rH=height(root.right);

            int selfDia=lH+rH+1;

            return Math.max(selfDia, Math.max(lDia, rDia));
        }
    }
    static class Info{
        int dia;
        int ht;

        Info(int dia, int ht){
            this.dia=dia;
            this.ht=ht;
        }
    }
    public static Info diameter2(Node root){//O(n)
        if(root==null){
            return new Info(0,0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo=diameter2(root.right);

        int dia=Math.max(leftInfo.dia,Math.max(rightInfo.dia, leftInfo.ht+rightInfo.ht+1));
        int height=Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(dia,height);
    }
    public static void main(String[] args){
        //int[] nodes1={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes2={1,2,4,9,-1,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        Node root=BinaryTree.createTree(nodes2);
        BinaryTree.levelOrder(root);
        System.out.println("Diameter of given tree: "+diameter2(root).dia);

    }
}
