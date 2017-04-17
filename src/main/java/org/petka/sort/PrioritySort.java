package org.petka.sort;

import java.util.List;
import java.util.PriorityQueue;

public class PrioritySort<T extends Element<List<E>, E>, E extends Comparable<E>> {

    private PriorityQueue<T> queue = new PriorityQueue<>();

    public void add(T element) {
        queue.add(element);
    }

    public boolean hasElement() {
        return queue.size() != 0;
    }

    public E get() {
        T element = queue.poll();
        E el = element.getNextElement();
        if (element.hasMoreElements()) {
            queue.add(element);
        }
        return el;
    }
}
