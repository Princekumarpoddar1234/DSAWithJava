import java.util.*;
public class BinaryTree6 {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node createTree(int[] nodes, int[] idx){
        if(nodes[idx[0]]==-1){
            idx[0]++;
            return null;
        }
        Node newNode= new Node(nodes[idx[0]++]);
        newNode.left=createTree(nodes, idx);
        newNode.right=createTree(nodes,idx);

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
    static class Info{
        Node node;
        int hd;
        public Info(Node node, int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static void topView(Node root){
        //if(root==null) return;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min=0,max=0;
        q.add(new Info(root,0));
        q.add(null);
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd,curr.node);
                }
                if(curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hd-1));
                    min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max,curr.hd+1);
                }
            }
            
        }

        //printing top order
        for(int i=min; i<=max; i++){
            if(map.containsKey(i)){
                System.out.print(map.get(i).data+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] nodes1 = {1,2,4,-1,-1,5,-1,-1,3,4,-1,-1,6,-1,-1};
        int[] nodes2={1,2,-1,4,-1,5,-1,6,-1,-1,3,-1,-1};
        Node root1=createTree(nodes1, new int[]{0});
        Node root2 =createTree(nodes2, new int[]{0});

        //levelOrder(root1);
        //System.out.println();
        //levelOrder(root2);
        topView(root1);
        System.out.println();
        topView(root2);
    }
}
