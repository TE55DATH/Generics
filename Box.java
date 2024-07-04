package Generics;

public class Box<T extends Comparable<T>> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return data.getClass().getName() + ": " + data;
    }

    public int compareTo(T other) {
        return data.compareTo(other);
    }
}
