package org.marko;

import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        var arr = new Integer[] { 5, 5, 2, 3, 2, 4, 10, 17, 13, 50, 5, 1, 2, 4 };
        var arrStream = Stream.of(arr);
        var groupedArr = arrStream.collect(groupingBy(Integer::intValue));

        groupedArr.forEach((val, list) -> System.out.println("Group: " + val + " num of: " + list.size()));




    }
}