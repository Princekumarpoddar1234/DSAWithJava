import java.util.*;
public class Heap3 {
    static class Heap{//O(logn)
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x=arr.size()-1;//child index

            int p=(x-1)/2;//parent child

            while(x>0 && arr.get(x)<arr.get(p)){
                // int temp=arr.get(x);
                // arr.set(x,arr.get(p));
                // arr.set(p,temp);
                Collections.swap(arr,x,p);

                x=p;
                p=(x-1)/2;
            }
        }
        public int peek(){
            if(arr.isEmpty()) return -1;
            return arr.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;//assume

            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){
                // int temp=arr.get(i);
                // arr.set(i,arr.get(minIdx));
                // arr.set(minIdx,temp);
                Collections.swap(arr,minIdx,i);

                heapify(minIdx);
            }
        }
        
        public int remove(){
            int data=arr.get(0);//get the peek

            //step2-swap first and last index value and delete last position
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            //step3-heapify
            heapify(0);
            return data;
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

        while(!h.isEmpty()){
            System.out.print(h.peek()+" ");
            h.remove();
        }
    }
}
