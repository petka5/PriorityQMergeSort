package com.github.petka5.sort;

import java.util.List;

/**
 * Implementation of PriorityQMergeSort that holds List
 * 
 * @author Petka
 *
 * @param <T>
 * @param <E>
 */
public class ListElement<T extends List<E>, E extends Comparable<E>> extends PriorityQMergeSort<T, E> {

    public ListElement(T source) {
        this.source = source;
    }

    @Override
    public E getNext() {
        return this.source.remove(0);
    }

    @Override
    public boolean hasNext() {
        return source.size() != 0;
    }

    @Override
    public E checkNext() {
        return this.source.get(0);
    }

    @Override
    public int compareTo(PriorityQMergeSort<T, E> o) {
        return checkNext().compareTo(o.checkNext());
    }

}
