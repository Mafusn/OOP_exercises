package session6_exercises.Problem4;

import java.util.HashMap;
import java.util.Map;

public class Dictionary<K, V> {
    private Map<K, V> pairs;

    public Dictionary() {
        this.pairs = new HashMap<>();
    }

    public V getValue(V value) {
        return pairs.get(value);
    }

    public void put(Pair pair) {
        this.pairs.put((K) pair.getKey(), (V) pair.getValue());
    }

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();

        Pair pair = new Pair(23, "Tester");
        Pair pair1 = new Pair(24, "Teste");

        dict.put(pair);
        dict.put(pair1);

        System.out.println(dict.getValue(23));
        System.out.println(dict.getValue(24));
    }
}
