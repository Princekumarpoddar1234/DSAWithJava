public class spiralMatrix {
    public static void spiralMatrixFunction(int array[][]){
        int rowStart=0;
        int rowEnd=3;
        int columnStart=0;
        int columnEnd=3;
        while(rowStart<=rowEnd && columnStart<=columnEnd) {
            //top
            for(int j=columnStart; j<=columnEnd; j++) {
                System.out.print(array[rowStart][j]+",");
            }

            //right
            for(int i=rowStart+1; i<=rowEnd; i++){
                System.out.print(array[i][columnEnd]+",");
            }

            //bottom
            for(int j=columnEnd-1; j>=columnStart; j--) {
                if(rowStart==rowEnd)
                break;
                System.out.print(array[rowEnd][j]+",");
            }

            //left
            for(int i=rowEnd-1; i>=rowStart; i--) {
                if(columnStart==columnEnd)
            break;
                System.out.print(array[i][columnStart]+"," );
            }
            rowStart++;
            rowEnd--;
            columnStart++;
            columnEnd--;
        }
    }
    public static void main(String args[]) {
        int array[][] = {{1,2,3,4},
                         {5,6,7,8}, 
                         {9,10,11,12},
                         {13,14,15,16}};
        spiralMatrixFunction(array);
    }
}
