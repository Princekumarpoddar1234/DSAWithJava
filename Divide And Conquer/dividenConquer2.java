public class dividenConquer2 {
    public static void main(String args[]) {
        int arr[] = {6,3,9,8,2,5};
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }

        int PIdx = partition(arr, si, ei);
        quickSort(arr, si, PIdx-1);
        quickSort(arr, PIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei){
        int i= si-1;
        int pivot = arr[ei];

        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
}
