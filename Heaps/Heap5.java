public class Heap5 {
    private static void heapify(int[] arr, int i, int size){
        int left=i*2+1;
        int right=i*2+2;
        int maxIdx=i;

        if(left<size && arr[maxIdx]<arr[left]){
            maxIdx=left;
        }
        if(right<size && arr[maxIdx]<arr[right]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr,maxIdx,size);
        }
    }
    public static void heapSort(int[] arr){
        int n=arr.length;

        //build maxHeap
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }
        //push largest at end
        for(int i=n-1; i>0; i--){
            //swap largest with last
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            //heapify for remaining unsorted elements
            heapify(arr,0,i);
        }
    }
    public static void main(String[] args){
        int[] arr ={1,2,4,5,3};
        heapSort(arr);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
