package com.indiaJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book",
                "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> stringLongMap = listOfStrings.stream().collect(Collectors.
                groupingBy(Function.identity(), Collectors.counting()));
        String key = stringLongMap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(key);
    }
}
