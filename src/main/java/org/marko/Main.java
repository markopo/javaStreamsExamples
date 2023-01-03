package org.marko;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {

        var arr = new Integer[] { 5, 5, 2, 3, 2, 4, 10, 17, 13, 50, 5, 1, 2, 4 };
        var arrStream = Stream.of(arr);
        var groupedMap = arrStream
                            .collect(groupingBy(Integer::intValue));

        var groupedAndSortedArr = groupedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

        groupedAndSortedArr.forEach((val, list) -> System.out.println("Group: " + val + " num of: " + list.size()));




    }
}