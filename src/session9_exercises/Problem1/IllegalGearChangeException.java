package session9_exercises.Problem1;

public class IllegalGearChangeException extends RuntimeException{
    private String errorMessage;
    public IllegalGearChangeException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
