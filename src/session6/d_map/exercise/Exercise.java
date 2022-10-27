package session6.d_map.exercise;

/**
 * Exercise: Implementing ChessBoard using a Map<Position,ChessPiece> object.
 *   a) Run the code and see how the solution is correct.
 *   b) At ChessBoard class (Line 5), change the type of the field "pieces" to Map<Position,ChessPiece>.
 *   c) Fix the constructor (Line 8).
 *   d) Fix the methods of the ChessBoard Class.
 *   e) Overwrite the equals and hashCode methods in the Position class.
 */
public class Exercise {
    public static void main(String[] args) {

        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();
        ChessPiece king = new King(chessBoard,"Black", new Position(0, 0));
        ChessPiece queen = new Queen(chessBoard,"Black", new Position(0, 7));


        //Start to move pieces
        boolean success = chessBoard.moveChessPiece(queen, new Position(0,6));
        System.out.println(success);

        System.out.println(chessBoard.getChessPiece(new Position(0, 0)));
    }
}
