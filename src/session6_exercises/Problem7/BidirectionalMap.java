package session6_exercises.Problem7;

import java.util.HashMap;
import java.util.Map;

public class BidirectionalMap<A, B> {
    public Map<A, B> ab;
    public Map<B, A> ba;

    public BidirectionalMap() {
        ab = new HashMap<>();
        ba = new HashMap<>();
    }

    public void put(A a, B b) {
        this.ab.put(a, b);
        this.ba.put(b, a);
    }

    public B getForward(A a) {
        return this.ab.get(a);
    }

    public A getBackard(B b) {
        return this.ba.get(b);
    }

    public static void main(String[] args) {
        BidirectionalMap bidirectionalMap = new BidirectionalMap();

        bidirectionalMap.put(1, 2);
        bidirectionalMap.put(2, 3);
        System.out.println(bidirectionalMap.getForward(1));
        System.out.println(bidirectionalMap.getBackard(2));
        System.out.println(bidirectionalMap.getForward(2));
    }
}
