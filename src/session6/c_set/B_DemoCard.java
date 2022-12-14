package session6.c_set;


import java.util.HashSet;
import java.util.Set;


/**
 * Exercise:
 * a) Run the code below and try to understand why the size of this Set is equal to 6.
 * b) Overwrite the "equals" and "hashcode" methods of the class "Card" and try to understand why the size
 * of this set is now equal to 4.
 */
public class B_DemoCard {
    public static void main(String[] args) {
        Set<Card> cards = new HashSet<>();

        cards.add(new Card("Ace of Hearts"));
        cards.add(new Card("Ace of Hearts"));
        cards.add(new Card("Queen of Spades"));
        cards.add(new Card("Queen of Spades"));
        cards.add(new Card("Ten of Hearts"));
        cards.add(new Card("Two of Clubs"));

        int size = cards.size();

        for (Card card: cards) {
            System.out.println(card);
        }
        System.out.println(size);
    }
}
