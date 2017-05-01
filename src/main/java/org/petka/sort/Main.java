package org.petka.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    private static Random random = new Random();

    private static Function<List<Long>, Long> getNext = (List<Long> a) -> a.remove(0);

    private static Predicate<List<Long>> hasNext = (List<Long> a) -> a.size() != 0;

    private static Function<List<Long>, Long> checkNext = (List<Long> a) -> a.get(0);

    private static Comparator<PriorityQMergeSort<List<Long>, Long>> comparator =
            (PriorityQMergeSort<List<Long>, Long> o1, PriorityQMergeSort<List<Long>, Long> o2) -> o1.checkNext().compareTo(o2.checkNext());

    public static void main(String[] args) {

        PriorityQMergeSorter<PriorityQMergeSort<List<Long>, Long>, List<Long>, Long> prioritySort = new PriorityQMergeSorter<>();

        PriorityQMergeSort<List<Long>, Long> list1 = createWrapper();

        PriorityQMergeSort<List<Long>, Long> list2 = createWrapper();

        PriorityQMergeSort<List<Long>, Long> list3 = createWrapper();

        PriorityQMergeSort<List<Long>, Long> list4 = createWrapper();

        prioritySort.add(list1);
        prioritySort.add(list2);
        prioritySort.add(list3);
        prioritySort.add(list4);

        List<Long> resultList = new ArrayList<>();
        while (prioritySort.hasElement()) {
            resultList.add(prioritySort.get());
        }
        System.out.println(resultList);

    }

    private static PriorityQMergeSort<List<Long>, Long> createWrapper() {
        PriorityQMergeSort<List<Long>, Long> wrapper = new PriorityQMergeSort<List<Long>, Long>(createList());
        wrapper.setCheckNext(checkNext);
        wrapper.setComparator(comparator);
        wrapper.setGetNext(getNext);
        wrapper.setHasNext(hasNext);

        return wrapper;
    }

    private static List<Long> createList() {
        List<Long> list = new ArrayList<>();
        fillList(list, random.nextInt(100));
        return list;
    }

    private static void fillList(List<Long> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(Long.valueOf(random.nextInt(100)));
        }
        Collections.sort(list);
    }
}
