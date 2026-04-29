public class BinaryTree9 {
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
        Node newNode = new Node(nodes[idx[0]++]);
        newNode.left=createTree(nodes, idx);
        newNode.right=createTree(nodes, idx);

        return newNode;
    }
    public static Node lca(Node root, int n1, int n2){
        if(root==null || root.data==n1 || root.data==n2){
            return root;
        }
        Node leftLca=lca(root.left,n1,n2);
        Node rightLca=lca(root.right,n1,n2);

        if(leftLca==null){
            return rightLca;
        }
        if(rightLca==null){
            return leftLca;
        }
        return root;
    }
    public static int minDist(Node lc, int n){
        if(lc==null){
            return -1;
        }
        if(lc.data==n){
            return 0;
        }
        int leftD=minDist(lc.left,n);
        int rightD=minDist(lc.right,n);
        if(leftD==-1 && rightD==-1){
            return -1;
        }else if(leftD==-1){
            return rightD+1;
        }else{
            return leftD+1;
        }

    }
    public static int minDistance(Node root, int n1, int n2){
        Node lc=lca(root, n1, n2);
        int dist1=minDist(lc, n1);
        int dist2=minDist(lc,n2);

        return dist1+dist2;
    }
    public static void main(String[] args){
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,7,-1,-1};
        Node root=createTree(nodes, new int[]{0});
        System.out.println("Minimum Distance: "+minDistance(root, 4, 4));
    }
}
