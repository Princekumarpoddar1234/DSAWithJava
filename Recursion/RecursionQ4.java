public class RecursionQ4 {
    public static void main(String args[]) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        occurrenceKey(arr, 0, 2);
    }

    public static void occurrenceKey(int arr[], int index, int key) {
        if (index == arr.length){
            return ;
        }

        if(arr[index]==key){
            System.out.print(index+" ");
           
        }

        occurrenceKey(arr, index+1, key);
    }
}
