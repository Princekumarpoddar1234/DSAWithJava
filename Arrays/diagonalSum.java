public class diagonalSum{
    public static void printDiagonalSum(int[][] array) {
        int sum=0;
        for(int i=0; i<array.length; i++) {
            //primary diagonal
            sum+=array[i][i];

            //secondary diagonal
            if (i!=array.length-i-1) {
                sum+=array[i][array.length-i-1];
            }
        }
        System.out.println("sum="+sum);
    }
    public static void main(String args[]) {
        int arr[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        printDiagonalSum(arr);
    }
}