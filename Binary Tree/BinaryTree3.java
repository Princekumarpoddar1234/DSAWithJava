public class BinaryTree3 {
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
        public static Node treeFormation(int[] nodes){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=treeFormation(nodes);
            newNode.right=treeFormation(nodes);

            return newNode;
        }

        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);

            return Math.max(lh, rh)+1;
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int leftC=count(root.left);
            int rightC=count(root.right);

            return leftC+rightC+1;
        }
        public static int sumOfNodes(Node root){
            if(root==null){
                return 0;
            }
            int leftS=sumOfNodes(root.left);
            int rightS=sumOfNodes(root.right);

            return leftS+rightS+root.data;
        }
    }
    //this code has problem with the name of public class, so use command : javac BinaryTree3.java   then          java BinaryTree3
    public static void main(String[] args){
        //int[] nodes1 ={1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        int[]nodes2={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=BinaryTree.treeFormation(nodes2);
        System.out.println("Height of given Tree: "+BinaryTree.height(root));
        System.out.println("Number of Nodes in given Tree: "+BinaryTree.count(root));
        System.out.println("Sum of Nodes of a Tree: "+BinaryTree.sumOfNodes(root));

    }
}
