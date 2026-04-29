public class SegmentTrees1 {
    static int[] tree;//segment tree array
    public static void init(int n){
        tree=new int[4*n];//segment tree size is 4*n
    }
    public static int buildST(int[] arr, int i, int start, int end){ //O(n)
        if(start==end){
            tree[i]=arr[start]; //leaf node
            return tree[i];
        }
        int mid=start+(end-start)/2;
        buildST(arr,2*i+1,start,mid);//build left child
        buildST(arr,2*i+2,mid+1,end);//build right child
        //store the sum of left and right child in the current node
        tree[i]=buildST(arr,2*i+1, start,mid) + buildST(arr,2*i+2,mid+1,end);
        return tree[i];
    }
    public static void printTree(int[] tree){//utility function to print the segment tree
        System.out.print("Segment Tree: ");
        for(int node:tree){
            System.out.print(node+ " ");
        }
        System.out.println();
    }
    public static int getSumUtil(int i, int si, int sj, int qi, int qj){ //O(log n)
        if(sj<=qi || si>=qj){
            return 0; //no overlap
        }else if(si>=qi && sj<=qj){
            return tree[i]; //total overlap
        }else{
            int mid=(si + sj) /2;
            int left=getSumUtil(2*i+1, si, mid, qi, qj);
            int right=getSumUtil(2*i+2, mid+1, sj, qi,qj);
            return left + right; //partial overlap
        }
    }
    public static int getSum(int[] arr, int qi, int qj){ //utility function to get the sum from index qi to qj
        return getSumUtil(0,0,arr.length-1, qi, qj);
    }
    public static void update(int[] arr, int idx, int newVal){
        int n=arr.length;
        int diff=newVal-arr[idx];//calculate the difference
        arr[idx]=newVal; //update the original array
        updateUtil(0,0,n-1,idx,diff);
    }
    public static void updateUtil(int i, int si, int sj, int idx, int diff){//O(log n)
        if(idx<si || idx>sj){
            return; //no overlap
        }
        tree[i]+=diff;
        if(si!=sj){//not a leaf node
            int mid=si+(sj-si)/2;
            updateUtil(2*i+1,si,mid,idx,diff);//update left child
            updateUtil(2*i+2,mid+1,sj,idx,diff);//update right child
        }
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5,6,7,8};
        int n=arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);
        printTree(tree);
        System.out.println("Sum: "+getSum(arr, 2 ,5)); //sum from index 2 to 5
        update(arr, 2, 2); //update index 3 to value 2
        printTree(tree);
        System.out.println("Sum: "+getSum(arr, 2 ,5)); //sum from index 2 to 5 after update
    }
}
