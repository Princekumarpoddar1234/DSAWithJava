public class DividenConquerQ2 {
    public static void main(String args[]) {
        int arr[] = {2,4,1,3,5};
        int result = mergeSort(arr, 0, arr.length-1);
        System.out.println(result);

    }

    public static int mergeSort(int arr[], int si, int ei){
        int invCount = 0;
        if(si<ei){
            int mid = (ei-si)/2 + si;

            invCount = mergeSort(arr, si, mid);
            invCount+=mergeSort(arr, mid+1, ei);
            invCount+=merge(arr, si, mid, ei);
        }
        return invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei){
        int invCount = 0;
        int i = si;
        int j = mid+1;
        int k = 0;
        int temp[] = new int[ei-si+1];

        while(i<=mid && j<=ei){
            if (arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                invCount+=(mid-i+1);
                j++;
                k++;
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }


        for(i=si, k=0; i<=ei; i++, k++){
            arr[i] = temp[k];
        }
        return invCount;
    }
}
// public class DividenConquerQ2 {
//     public static void main(String args[]) {
//         int arr[] = {3, 2, 4, 5, 6};
//         int result = mergeSort(arr, 0, arr.length - 1);
//         System.out.println("Number of inversions: " + result);
//     }

//     // Merge sort function that also counts inversions
//     public static int mergeSort(int arr[], int si, int ei) {
//         int invCount = 0;
//         if (si < ei) {
//             int mid = si + (ei - si) / 2;

//             invCount += mergeSort(arr, si, mid);
//             invCount += mergeSort(arr, mid + 1, ei);
//             invCount += merge(arr, si, mid, ei);
//         }
//         return invCount;
//     }

//     // Merge function that counts inversions
//     public static int merge(int arr[], int si, int mid, int ei) {
//         int invCount = 0;
//         int i = si;
//         int j = mid + 1;
//         int k = 0;
//         int temp[] = new int[ei - si + 1];

//         // Counting inversions and merging
//         while (i <= mid && j <= ei) {
//             if (arr[i] <= arr[j]) {
//                 temp[k++] = arr[i++];
//             } else {
//                 temp[k++] = arr[j++];
//                 // Inversions counted for the number of remaining elements in the left half
//                 invCount += (mid - i + 1);
//             }
//         }

//         // Copy remaining elements from the left half
//         while (i <= mid) {
//             temp[k++] = arr[i++];
//         }

//         // Copy remaining elements from the right half
//         while (j <= ei) {
//             temp[k++] = arr[j++];
//         }

//         // Copy the merged elements back into the original array
//         for (i = si, k = 0; i <= ei; i++, k++) {
//             arr[i] = temp[k];
//         }

//         return invCount;
//     }
// }
