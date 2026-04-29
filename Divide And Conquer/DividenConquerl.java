public class DividenConquerl {
    public static void main(String args[]) {
        int arr[] = {4,5,6,7,0,1,2};
        int idx = search(arr, 0, 0, arr.length-1);
        System.out.println(idx);
    }

    public static int search(int arr[], int target, int si, int ei){
        if (si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        //hit case
        if (arr[mid]==target){
            return mid;
        }

        //lie on line 1
        if (arr[si] <= arr[mid]){
            if (arr[si] <= target && target <= arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                //right side
                return search(arr, target, mid+1, ei);
            }
        }//lie on line2
        else{
            //right side 
            if(arr[ei] >= target && target >= arr[mid]){
                return search(arr, target, mid+1, ei);
            }
            else{
                //left side
                return search(arr, target, si, mid-1);
            }
        }
    }
}
