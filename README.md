# PriorityQMergeSort

Merging several sorted collections, with different sizes, into one sorted collection via PriorityQueue.

Input collections are wrapped by implementation of [PriorityQMergeSort](src/main/java/org/petka/sort/PriorityQMergeSort.java) and added to
[PriorityQMergeSorter](src/main/java/org/petka/sort/PriorityQMergeSorter.java)


# Requirements
Java 1.7 or higher
# Getting started
1. Creates your own implemetation of [PriorityQMergeSort](src/main/java/org/petka/sort/PriorityQMergeSort.java) to wrap your source collections.
1. Creates [PriorityQMergeSorter](src/main/java/org/petka/sort/PriorityQMergeSorter.java) and put your wrapped collections into it.
1. Obtains elements one by one from the [PriorityQMergeSorter](src/main/java/org/petka/sort/PriorityQMergeSorter.java)

* Example code sorting sorted List of Long elements.
``` java
private static Random random = new Random();

public static void main(String[] args) {
        PriorityQMergeSorter<ListElement<List<Long>, Long>, List<Long>, Long> prioritySort = new PriorityQMergeSorter<>();
        prioritySort.add(createElement());
        prioritySort.add(createElement());
        prioritySort.add(createElement());
        while (prioritySort.hasElement()) {
                System.out.println(prioritySort.get());
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
``` 

You can find implementation of ListElement [here](src/main/java/org/petka/sort/ListElement.java).
