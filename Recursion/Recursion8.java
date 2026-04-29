public class Recursion8 {
    public static void main(String args[]) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr,5,0));
    }

    public static int lastOccurence(int arr[] , int key, int i) {
        if (i==arr.length){
            return -1;
        }

        int lastOccur = lastOccurence(arr,key,i+1);

        if(lastOccur==-1 && arr[i]==key){
            return i;
        }

        return lastOccur;
    }
}
