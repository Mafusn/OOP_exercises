package session6_exercises.Problem1;

public class Box<T> {
    private T box;

    public Box(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public boolean setBox(T box) {
        if (box == null) return false;

        this.box = box;
        return true;
    }

    public static void main(String[] args) {
        Box box = new Box(45);
        System.out.println(box.getBox());

        box.setBox("tester");

        System.out.println(box.getBox());

    }
}
