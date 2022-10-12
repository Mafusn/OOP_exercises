package session6.b_list;

import java.util.Comparator;

public class StringLengthOrder implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}
