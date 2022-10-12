package session6_exercises.Problem2;

import java.util.*;
import java.util.stream.Collector;

public class Pair<A, B> {
    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    public A getA() {
        return a;
    }

    public B getB() {
        return b;
    }

    public Pair swap() {
        Pair pair = new Pair(this.b, this.a);

        return pair;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Pair pair = new Pair("tester", false);
        System.out.println(pair);
        pair = pair.swap();
        System.out.println(pair);
    }
}
