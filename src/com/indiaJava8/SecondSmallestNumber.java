package com.indiaJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondSmallestNumber {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer integer = listOfIntegers.stream().sorted().findFirst().get();
        System.out.println(integer);
        listOfIntegers.stream().sorted().limit(2).skip(1).forEach(System.out::println);
        Integer integer1 = listOfIntegers.stream().sorted().skip(1).findFirst().orElse(0);
        System.out.println(integer1);
    }
}
