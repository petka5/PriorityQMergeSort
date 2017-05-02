package org.petka.sort;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * 
 * This class wraps sorted collection <b>sources</b> which later will be merged by PriorityQMergeSorter.
 * 
 * @author Petka
 *
 * @param <T>
 * @param <E>
 */
public class PriorityQMergeSort<T, E> implements Comparable<PriorityQMergeSort<T, E>> {

    /**
     * This is the source of the sorted collection
     */
    private T source;

    /**
     * getNext lambda
     */
    private Function<T, E> getNext;
    /**
     * hasNext lambda
     */
    private Predicate<T> hasNext;
    /**
     * checkNext lambda
     */
    private Function<T, E> checkNext;
    /**
     * lambda comparator
     */
    private Comparator<PriorityQMergeSort<T, E>> comparator;

    public PriorityQMergeSort(T source) {
        this.source = source;
    }

    /**
     * Set getNext lambda.
     * 
     * @param getNext
     */
    public void setGetNext(Function<T, E> getNext) {
        this.getNext = getNext;
    }

    /**
     * Set hasNext lambda.
     * 
     * @param hasNext
     */
    public void setHasNext(Predicate<T> hasNext) {
        this.hasNext = hasNext;
    }

    /**
     * Set checkNext lambda.
     * 
     * @param checkNext
     */
    public void setCheckNext(Function<T, E> checkNext) {
        this.checkNext = checkNext;
    }

    /**
     * Set lambda comparator.
     * 
     * @param comparator
     */
    public void setComparator(Comparator<PriorityQMergeSort<T, E>> comparator) {
        this.comparator = comparator;
    }

    /**
     * Get next element from the sorted collection.
     * 
     * @return <E>
     */
    public E getNext() {
        return this.getNext.apply(source);

    }

    /**
     * Check if there is another element in collection
     * 
     * @return boolean
     */
    public boolean hasNext() {
        return hasNext.test(source);

    }

    /**
     * Get next element from collection in order to compare it.
     * 
     * @return <E>
     */
    public E checkNext() {
        return this.checkNext.apply(source);
    }

    @Override
    public int compareTo(PriorityQMergeSort<T, E> o) {
        return comparator.compare(this, o);

    }
}
