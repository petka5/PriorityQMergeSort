# PriorityQMergeSort

Merging several sorted collections, with different sizes, into one sorted collection via PriorityQueue.

Input collections are wrapped by [PriorityQMergeSort](src/main/java/org/petka/sort/PriorityQMergeSort.java) and added to
[PriorityQMergeSorter](src/main/java/org/petka/sort/PriorityQMergeSorter.java)


# Requirements
Java 1.7 or higher

# Getting started
``` java
        PriorityQMergeSorter<ListElement<List<Long>, Long>, List<Long>, Long> prioritySort = new PriorityQMergeSorter<>();

``` 