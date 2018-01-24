package com.github.petka5.sort;

import java.util.PriorityQueue;

/**
 * The purpose if this class is to merge already sorted collections
 * 
 * @author Petka
 *
 * @param <T>
 * @param <K>
 * @param <E>
 */
public class PriorityQMergeSorter<T extends PriorityQMergeSort<K, E>, K, E> {

    /**
     * PriorityQueue that is used for choosing of the next element.
     */
    private PriorityQueue<T> queue = new PriorityQueue<>();

    /**
     * Adding new sorted collection wrapped by PriorityQMergeSort
     * 
     * @param element
     */
    public void add(T element) {
        queue.add(element);
    }

    /**
     * Check if there is another element in the queue
     * 
     * @return
     */
    public boolean hasElement() {
        return queue.size() != 0;
    }

    /**
     * Get next element.
     * 
     * @return
     */
    public E get() {
        T element = queue.poll();
        E el = element.getNext();
        if (element.hasNext()) {
            queue.add(element);
        }
        return el;
    }
}
