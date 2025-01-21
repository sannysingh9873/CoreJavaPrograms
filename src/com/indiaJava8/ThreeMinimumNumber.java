package com.indiaJava8;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;


public class ThreeMinimumNumber {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> integerList = listOfIntegers.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(integerList);


    }
}
