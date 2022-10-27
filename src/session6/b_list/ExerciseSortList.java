package session6.b_list;

import java.util.*;

/**
 * Exercise: Create a new comparator that allows ordering the String objects of a List
 * by their length (i.e. shortest strings come first).
 */
public class ExerciseSortList {

    public static void main(String[] args) {
        List<String> cards = new ArrayList<>();

        cards.add("Ace of Hearts");
        cards.add("Queen of Spades");
        cards.add("Ten of Hearts");
        cards.add("Ace of Hearts");
        cards.add("Two of Clubs");

        Comparator<String> comparator = new StringLengthOrder();
        Collections.sort(cards, comparator);

        for (String card: cards){
            System.out.println(card);
        }
    }

}
