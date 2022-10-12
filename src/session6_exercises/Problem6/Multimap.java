package session6_exercises.Problem6;

import java.util.*;

public class Multimap<K, V> {
    private Map<K, Set<V>> multimap;

    public Multimap() {
        multimap = new HashMap<>();
    }

    public Set<V> get(K k) {
        return this.multimap.get(k);
    }

    public void put(K k, V v) {
        if (multimap.get(k) == null) {
            multimap.put(k, new HashSet<V>());
            multimap.get(k).add(v);
        } else {
            multimap.get(k).add(v);
        }
    }

    public Collection values() {
        return this.multimap.values();
    }

    public static void main(String[] args) {
        Multimap multimap1 = new Multimap();

        multimap1.put(1, 2);
        multimap1.put(1, 3);
        multimap1.put(1, 4);
        multimap1.put(1, 5);
        multimap1.put(2, 4);


        System.out.println(multimap1.values());
        System.out.println(multimap1.get(1) + ", " + multimap1.get(2));
    }
}
