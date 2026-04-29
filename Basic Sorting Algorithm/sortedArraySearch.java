public class sortedArraySearch {
    public static boolean arraySearch(int array[][],int key) {
        int row=0, col=array[0].length-1;
        while(row<=array.length-1 && col>=0) {
            if (array[row][col]==key) {
                System.out.println("Element found at index ["+row+"]["+col+"]");
                return true;
            }
            else if(array[row][col]>key) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int array[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {37,29,37,48},
                         {32,33,39,50}};
    arraySearch(array,33);
    }
}
