package session7_exercises.Problem3;

public class Password {

    private String password;
    public Password(String password) {
        this.password = password;
    }

    public String isStrong() {
        return "Sløjt";
    }

    public static void main(String[] args) {
        Password password = new Password("tester");

        System.out.println(password.isStrong());
    }
}
