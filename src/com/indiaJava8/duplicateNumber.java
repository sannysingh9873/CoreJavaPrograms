package com.indiaJava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateNumber {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> hs= new HashSet<>();
        List<Integer> duplicate = myList.stream().filter(p -> !hs.add(p)).collect(Collectors.toList());
        List<Integer> duplicate1 = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().filter(p -> p.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicate);
        System.out.println(duplicate1);
    }
}
