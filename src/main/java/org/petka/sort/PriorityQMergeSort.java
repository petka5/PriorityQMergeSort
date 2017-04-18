package org.petka.sort;

/**
 * 
 * This class wraps sorted collection <b>sources</b> which later will be merged by PriorityQMergeSorter.
 * 
 * @author Petka
 *
 * @param <T>
 * @param <E>
 */
public abstract class PriorityQMergeSort<T, E> implements Comparable<PriorityQMergeSort<T, E>> {

    /**
     * This is the source of the sorted collection
     */
    protected T source;

    /**
     * Get next element from the sorted collection.
     * 
     * @return <E>
     */
    public abstract E getNext();

    /**
     * Check if there is another element in collection
     * 
     * @return boolean
     */
    public abstract boolean hasNext();

    /**
     * Get next element from collection in order to compare it.
     * 
     * @return <E>
     */
    public abstract E checkNext();

    @Override
    public abstract int compareTo(PriorityQMergeSort<T, E> o);
}
