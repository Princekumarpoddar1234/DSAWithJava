public class DividenConquerQ1 {
    public static void main(String args[]) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    //print
    public static void printArray(String arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    //mergeSort
    public static void mergeSort(String arr[], int si, int ei){
        if (si>=ei){
            return;
        }

        int mid = si + (ei-si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    //merge
    public static void merge(String arr[], int si, int mid, int ei){
        int i = si;
        int j = mid + 1;
        int k = 0;
        String temp[] = new String[ei-si+1];
        while(i <= mid && j <= ei){
            String s1 = arr[i];
            String s2 = arr[j];

            if ((s1.compareTo(s2))<=0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for left side remaining element
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for right side remaining element
        while(j <= ei){
            temp[k++] = arr[j++];
        }


        for(i = si, k = 0; i<temp.length; i++, k++) {
            arr[i] = temp[k];
        }
    }
}
