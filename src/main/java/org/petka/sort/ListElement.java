package org.petka.sort;

import java.util.List;

public class Element<T extends List<E>, E extends Comparable<E>> implements Comparable<Element<T, E>> {
    private T source;

    public Element(T source) {
        this.source = source;
    }

    public E getNextElement() {
        return this.source.remove(0);
    }

    public boolean hasMoreElements() {
        return source.size() != 0;
    }

    protected E checkNextElement() {
        return this.source.get(0);
    }

    @Override
    public int compareTo(Element<T, E> o) {
        return checkNextElement().compareTo(o.checkNextElement());
    }

}
