package session6.c_set;

import session6.d_map.exercise.Position;

import java.util.Objects;
import java.util.Random;

class Card {
    String name;

    public Card(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return name.equals(card.name);
    }
}
