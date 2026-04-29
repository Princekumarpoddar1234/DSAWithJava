public class Backtracking1 {
    public static void main(String agrs[]) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=val-2;  //backtracking
    }
}
