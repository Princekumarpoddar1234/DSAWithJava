public class Binarytree10 {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node create(int[] nodes, int[] idx){
        if(nodes[idx[0]]==-1){
            idx[0]++;
            return null;
        }
        Node newNode = new Node(nodes[idx[0]++]);
        newNode.left=create(nodes, idx);
        newNode.right=create(nodes, idx);
        return newNode;
    }
    public static int kthDistance(Node root, int n, int k){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int lD=kthDistance(root.left, n, k);
        int rD=kthDistance(root.right, n, k);
        int max=Math.max(lD, rD);
        if(max!=-1){
            if(max+1==k){
                System.out.println("kth ancestor: "+root.data);
            }
            return max+1;
        }
        return -1;
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftChild=transform(root.left);
        int rightChild=transform(root.right);

        int newLeft=root.left==null? 0: root.left.data;
        int newRight=root.right==null?0: root.right.data;
        int data=root.data;
        root.data=newLeft+leftChild+newRight+rightChild;

        return data;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        Node root=create(nodes, new int[]{0});
        preorder(root);
        System.out.println();
        kthDistance(root, 6, 1);
        transform(root);
        preorder(root);
    }
}