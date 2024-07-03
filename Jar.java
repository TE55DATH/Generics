package Generics;

import java.util.Stack;

public class Jar<T> {
    private Stack<T> contents;

    public Jar() {
        contents = new Stack<>();
    }

    public void add(T element) {
        contents.push(element);
    }

    public T remove() {
        if (contents.isEmpty()) {
            throw new IllegalStateException("Jar is empty");
        }
        return contents.pop();
    }
}
