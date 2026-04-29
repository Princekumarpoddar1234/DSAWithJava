public class SegmentTrees2 {
    static int[] tree; //segment tree array
    public static void init(int n){
        tree = new int[4*n];
    }
    public static void createST(int[] arr, int i, int si, int sj){ //max segment tree creation : O(n)
        if(si==sj){
            tree[i]=arr[si];//leaf node
            return ; //base case
        }
        int mid=si+(sj-si)/2;
        createST(arr,2*i+1,si,mid); //build left child
        createST(arr,2*i+2,mid+1,sj); //build right child
        tree[i]=Math.max(tree[2*i+1],tree[2*i+2]); //store the maximum of left and right child in the current node
    }
    public static void printTree(int[] tree){ //utility function to print the segment tree
        System.out.print("Segment Tree: ");
        for(int node : tree){
            System.out.print(node + " ");
        }
        System.out.println();
    }
    public static int getMax(int[] arr, int qi, int qj){
        return getMaxUtil(0,0,arr.length-1,qi,qj);
    }
    public static int getMaxUtil(int i, int si, int sj, int qi, int qj){
        if(sj < qi || si > qj){
            return Integer.MIN_VALUE; //no overlap
        }else if(si>=qi && sj<=qj){
            return tree[i]; //total overlap
        }else{
            int mid=si+(sj-si)/2;
            int left=getMaxUtil(2*i+1, si, mid, qi, qj);
            int right=getMaxUtil(2*i+2, mid+1, sj, qi, qj);
            return Math.max(left,right);
        }
    }
    public static void update(int[] arr, int idx, int newVal){
        arr[idx]=newVal; //update the original array
        int n=arr.length;
        updateUtil(0,0,n-1,idx,newVal); //update the segment tree
    }
    public static void updateUtil(int i, int si, int sj, int idx, int newVal){
        if(idx<si || idx>sj){
            return; //no overlap
        }
        tree[i]=Math.max(newVal,tree[i]); //update the current node
        if(si!=sj){ //not a leaf node
            int mid=si+(sj-si)/2;
            updateUtil(2*i+1,si,mid,idx,newVal); //update left child
            updateUtil(2*i+2,mid+1,sj,idx,newVal); //update right child
        }
    }
    public static void main(String[] args){
        int[] arr ={6,8,-1,2,17,1,3,2,4};
        int n=arr.length;
        init(n);
        createST(arr, 0, 0, n-1);
        printTree(tree);
        System.out.println("Max in range (2, 5): " + getMax(arr, 2, 5));

        update(arr,2,20);
        System.out.println("Max in range (2, 5) after update: " + getMax(arr, 2, 5));
    }
}
