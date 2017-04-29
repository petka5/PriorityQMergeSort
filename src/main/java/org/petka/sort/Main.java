package org.petka.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        PriorityQMergeSorter<ListElement<List<Long>, Long>, List<Long>, Long> prioritySort = new PriorityQMergeSorter<>();

        prioritySort.add(createElement());
        prioritySort.add(createElement());
        prioritySort.add(createElement());
        prioritySort.add(createElement());

        List<Long> list = new ArrayList<>();
        long time = System.currentTimeMillis();
        while (prioritySort.hasElement()) {
            list.add(prioritySort.get());
        }
        time = System.currentTimeMillis() - time;
        System.out.println(list);
        System.out.println("Execution time: " + time);

        List<String> listOne = new ArrayList<>();
        listOne.add("Petka");
        listOne.add("One");

        List<String> listTwo = new ArrayList<>();
        listTwo.add("Petka");
        listTwo.add("Petkaa");
        listTwo.add("Aloha");

        Collections.sort(listOne);
        Collections.sort(listTwo);

        PriorityQMergeSorter<PriorityQMergeSort<List<String>, String>, List<String>, String> queueTwo = new PriorityQMergeSorter<>();
        queueTwo.add(new ListElement<List<String>, String>(listOne));
        queueTwo.add(new ListElement<List<String>, String>(listTwo));

        while (queueTwo.hasElement()) {
            System.out.println(queueTwo.get());
        }

    }

    private static ListElement<List<Long>, Long> createElement() {
        List<Long> list = new ArrayList<>();
        fillList(list,random.nextInt(100));
        return new ListElement<List<Long>, Long>(list);
    }

    private static void fillList(List<Long> list, int size) {
        for (int i = 0; i < size; i++) {
            list.add(Long.valueOf(random.nextInt(100)));
        }
        Collections.sort(list);
    }
}
