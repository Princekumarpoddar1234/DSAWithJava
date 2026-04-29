public class Backtracking5 {
    private static void printBoard(char[][] chessBoard){
        System.out.println("-------------------chess Board-------------------");
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static boolean isSafe(char[][] chessBoard,int row, int col){
        //column
        for(int i=row-1;i>=0; i--){
            if(chessBoard[i][col]=='Q') return false;
        }

        //upper right area
        for(int i=row-1,j=col+1;i>=0 &&j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q') return false;
        }
        //upper left area
        for(int i=row-1, j=col-1;i>=0 && j>=0; i--,j--){
            if(chessBoard[i][j]=='Q') return false;
        }

        return true;
    }
    static int count=0;
    private static void nQueens(char[][] chessBoard, int row){
        if(row==chessBoard.length){
            //printBoard(chessBoard);
            count++;
            return;
        }
        for(int j=0; j<chessBoard.length; j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j]='Q';
                nQueens(chessBoard, row+1);
                chessBoard[row][j]='X';
            } 
        }
    }
    public static void main(String args[]){
        int n=5;
        char[][] chessBoard = new char[n][n];
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                chessBoard[i][j]='X';
            }
        }

        nQueens(chessBoard,0);
        System.out.println(count);
        printBoard(chessBoard);
        //this code will print all the possible ways to place n queens on n*n chess board
    }
}
