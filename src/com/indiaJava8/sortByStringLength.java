package com.indiaJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortByStringLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python",
                "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings.stream().sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> collect = list1.stream().filter(list2::contains).collect(Collectors.toList());


    }
}

