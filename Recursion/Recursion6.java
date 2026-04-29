public class Recursion6 {
    public static void main(String args[]) {
        int arr[] = {0,1,4,7,8,9,10};
        System.out.println(isSorted(arr,0));
    }

    public static boolean isSorted(int arr[] , int i){
        if (i==arr.length-1){
            return true;
        }

        if (arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }
}
