package session3.B_DesignWithInheritance;

/**
 * Exercise:
 *   - Create code to add a Bishop. Remember, a Bishop can only have diagonal movements of up to 8 squares.
 *   - Remember to send feedback when you are done.
 */
public class Exercise {

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();

        Bishop bishop = new Bishop(chessBoard, "White", 0,2);

        chessBoard.moveChessPiece(bishop, 2, 4);

        System.out.println(bishop.getX() + ", " + bishop.getY());
    }
}
