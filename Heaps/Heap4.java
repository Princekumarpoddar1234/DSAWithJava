import java.util.*;
public class Heap4 {
    static class Heap{//maxHeap
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            arr.add(data);
            int x=arr.size()-1;
            int p=(x-1)/2;

            while(x>0 && arr.get(x)>arr.get(p)){
                Collections.swap(arr,x,p);
                x=p;
                p=(x-1)/2;
            }
        }
        private void heapify(int i){

            int left=2*i+1;
            int right=2*i+2;
            int maxIdx=i;

            if(left<arr.size() && arr.get(maxIdx)<arr.get(left)){
                maxIdx=left;
            }
            if(right<arr.size() && arr.get(maxIdx)<arr.get(right)){
                maxIdx=right;
            }
            if(maxIdx!=i){
                Collections.swap(arr,maxIdx,i);

                heapify(maxIdx);
            }
        }
        public int remove(){
            int data=arr.get(0);

            //swap first and last
            Collections.swap(arr,0,arr.size()-1);

            //delete last index
            arr.remove(arr.size()-1);

            //headpify
            heapify(0);
            return data;
        }
        public int peek(){
            if(arr.size()==0) return -1;
            return arr.get(0);
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()){//heap sort-O(nlogn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
