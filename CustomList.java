package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T remove(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements.remove(index);
    }

    public boolean contains(T element) {
        return elements.contains(element);
    }

    public void swap(int index1, int index2) {
        if (index1 < 0 || index1 >= elements.size() || index2 < 0 || index2 >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Collections.swap(elements, index1, index2);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T e : elements) {
            if (e.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.max(elements);
    }

    public T getMin() {
        if (elements.isEmpty()) {
            return null;
        }
        return Collections.min(elements);
    }

    public void print() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
}

