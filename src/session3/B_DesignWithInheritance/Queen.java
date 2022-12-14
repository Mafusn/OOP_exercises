package session3.B_DesignWithInheritance;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color, int x, int y) {
        super(chessBoard,"Queen",color, x, y);
    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.chessBoard, x, y, newX, newY, 8) ||
                Movements.isLegalHorizontalMovement(this.chessBoard, x, y, newX, newY, 8) ||
                Movements.isLegalDiagonalMovement(this.chessBoard, x, y, newX, newY, 8);

        return success;
    }

}
