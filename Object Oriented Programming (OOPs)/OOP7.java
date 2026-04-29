public class OOP7 {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,left,right,diagonal(in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class pawn implements ChessPlayer{
    public void moves(){
        System.out.println("(up but only 1 step after check and 2 without initial check)");
    }
}

class King implements ChessPlayer{
    public void moves() {
        System.out.println("(up,down,left,right)-only one step");
    }
}
