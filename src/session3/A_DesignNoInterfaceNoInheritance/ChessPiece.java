package session3.A_DesignNoInterfaceNoInheritance;

/**
 * Exercise:
 *  * a) Discuss the constructor for the class.
 *  * b) Create, when needed, Getters and Setters for the fields of the class.
 **/

public class ChessPiece {

    private String type; // e.g. "King" or "Queen".
    private String color; //"White" or "Black"
    private int x;
    private int y;
    private ChessBoard chessBoard;

    public ChessPiece(ChessBoard chessBoard, String type, String color, int x, int y) {
        this.type = type;
        this.color = color;
        this.x = x;
        this.y = y;
        this.chessBoard = chessBoard;
        this.chessBoard.setInitialPositionChessPiece(x,y,this);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getType(){
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public ChessBoard getChessBoard() {
        return this.chessBoard;
    }

    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = false;
        switch(this.type){
            case "King":
                // Do movement
                success = Movements.isLegalVerticalMovement(this.chessBoard, this.x, this.y, newX, newY, 1) ||
                                Movements.isLegalHorizontalMovement(this.chessBoard, this.x, this.y, newX, newY, 1) ||
                                Movements.isLegalDiagonalMovement(this.chessBoard, this.x, this.y, newX, newY, 1);
                break;
            case "Queen":
                success =
                        Movements.isLegalVerticalMovement(this.chessBoard, this.x, this.y, newX, newY, 8) ||
                                Movements.isLegalHorizontalMovement(this.chessBoard, this.x, this.y, newX, newY, 8) ||
                                Movements.isLegalDiagonalMovement(this.chessBoard, this.x, this.y, newX, newY, 8);
                break;

            case "Bishop":
                success = Movements.isLegalDiagonalMovement(this.chessBoard, this.x, this.y, newX, newY, 8);
                break;
        }
        return success;
    }

    public static void main(String[] args) {

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/

        /*
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session3_A_ChessPiece", I_did_finish, I_did_understand, comment);
        */
    }

}
