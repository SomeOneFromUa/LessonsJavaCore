package Classwork5.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Indexer {
    private Integer[] arr = new Integer[10];

    public Indexer() {
    }

    public Indexer(Integer[] arr
    ) {
        for (Integer integer : arr) {
            if (integer > 10){
                throw new IllegalArgumentException("values must be less then 10");
            }
        }
        if (arr.length > 10) {
            throw new IllegalArgumentException("array must contain less then 10 elements");
        }

        this.arr = arr;
    }

    void findIndexes(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);
        int min = list.indexOf(number);
        int max = list.lastIndexOf(number);
        System.out.println("key = " + number);
        if (min == -1 && max == -1) {
            System.out.println(-1);
        } else System.out.println("MinIndex = " + min + "," + "MaxIndex = " + max);
    }
}
