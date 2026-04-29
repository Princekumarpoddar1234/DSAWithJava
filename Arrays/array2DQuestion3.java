public class array2DQuestion3 {
    public static void transpose(int matrix[][]) {
        int array[][]= new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length;i++){
            for(int j=0; j<matrix.length; j++) {
                array[i][j]=matrix[j][i];
            }
        }

        //traverse
        for(int i=0; i<matrix[0].length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int matrix[][]={{11,12,13},
                        {21,22,23}};
        transpose(matrix);
    }
}
