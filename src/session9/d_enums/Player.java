package session9.d_enums;

import java.util.Objects;

public class Player{

    String name;
    String colour;

    public Player(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", color='" + colour + '\'' +
                '}';
    }

}
