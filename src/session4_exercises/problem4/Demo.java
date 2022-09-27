package session4_exercises.problem4;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date dagsDato = new Date();
        PearishableProduct apple = new PearishableProduct(52512341, "Apple", 5, 10, dagsDato);
        NonPearishableProduct vand = new NonPearishableProduct(5132415, "Vand", 10, 6, 500, dagsDato);
        System.out.println(apple);
        System.out.println(vand);

        apple.add(4);
        vand.buy(2);

        System.out.println(apple);
        System.out.println(vand);
    }
}
