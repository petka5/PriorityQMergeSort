package org.petka.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        PrioritySort<Element<List<Long>, Long>, Long> prioritySort = new PrioritySort<>();

        prioritySort.add(createElement());
        prioritySort.add(createElement());
        prioritySort.add(createElement());
        prioritySort.add(createElement());

        while (prioritySort.hasElement()) {
            System.out.println(prioritySort.get());
        }

    }

    private static Element<List<Long>, Long> createElement() {
        List<Long> list = new ArrayList<>();
        fillList(list);
        return new Element<List<Long>, Long>(list);
    }

    private static void fillList(List<Long> list) {
        for (int i = 0; i < 10; i++) {
            list.add(Long.valueOf(random.nextInt(100)));
        }
        Collections.sort(list);
    }
}
