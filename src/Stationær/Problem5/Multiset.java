package Stationær.Problem5;

import java.util.*;

public class Multiset<E> {
    private Map<E, Integer> multiset;
    public Multiset() {
        multiset = new HashMap<E, Integer>();
    }


    public void addObject(E e) {
        this.multiset.computeIfPresent(e, (e1, e2) -> this.multiset.get(e) + 1);
        this.multiset.putIfAbsent(e, 1);
    }

    public int count(E e) {
        if (this.multiset.get(e) == null) {
            return 0;
        }
        return this.multiset.get(e);
    }

    public void remove(E e) {
        Integer count = this.multiset.get(e);
        this.multiset.computeIfPresent(e, (e2, e3) -> count - 1);
    }

    public int size() {
        return this.multiset.size();
    }

    public static void main(String[] args) {
        Multiset multiset = new Multiset();

        multiset.addObject(234);
        multiset.addObject(234);
        multiset.addObject(234);
        multiset.addObject(234);
        multiset.remove(234);

        multiset.addObject(236);
        multiset.addObject(237);
        multiset.addObject(238);

        System.out.println(multiset.count(238));
        System.out.println(multiset.size());
    }
}
