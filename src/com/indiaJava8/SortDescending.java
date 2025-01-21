package com.indiaJava8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDescending {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10, 15,10, 8, 49, 25, 98, 98, 32, 15);
        System.out.println("before sort : " +myList);
        List<Integer> sortedList = myList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("after sort : " +sortedList);

        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

        // Concatenated the list1 and list2 by converting them into Stream
    }

}
