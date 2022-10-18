package Stationær.Problem8;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private List<T> liste;

    public Queue() {
        liste = new ArrayList<>();
    }

    public void enqueue(T t) {
        liste.add(t);
    }

    public T dequeue() {
        T element = liste.get(0);
        liste.remove(0);
        return element;
    }

    public T drain(int n) {
        T element = liste.get(n - 1);
        if (n >= this.liste.size()) {
            this.liste.clear();
        } else {
            for (int i = 0; i <= n - 1; i++) {
                this.liste.remove(0);
            }
        }
        return element;
    }

    @Override
    public String toString() {
        for (int i = 0; i <= this.liste.size() - 1; i++) {
            System.out.print(this.liste.get(i));
            if (i < this.liste.size() - 1) {
                System.out.print(", ");
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Queue kø = new Queue();

        kø.enqueue(1);
        kø.enqueue(2);
        kø.enqueue(3);
        kø.enqueue(4);

        System.out.println(kø);
    }
}
