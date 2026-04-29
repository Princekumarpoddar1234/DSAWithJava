public class Heap6 {
    public static void heapify(int[] arr, int i, int size){//O(logn)
        int left=i*2+1;
        int right=i*2+2;
        int minIdx=i;

        if(left<size && arr[minIdx]>arr[left]){
            minIdx=left;
        }
        if(right<size && arr[minIdx]>arr[right]){
            minIdx=right;
        }
        if(minIdx!=i){
            int temp=arr[minIdx];
            arr[minIdx]=arr[i];
            arr[i]=temp;

            heapify(arr,minIdx,size);
        }
    }
    public static void heapSort(int[] arr){
        int n=arr.length;
        //create minHeap
        for(int i=n/2; i>=0; i--){//O(nlogn)
            heapify(arr,i,n);
        }
        //push largest at the last and heapify without it everytime
        for(int i=n-1; i>0; i--){//O(nlogn)
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            //heapify
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,5,3};
        heapSort(arr);//descending order using minHeap and O(nlogn)
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
