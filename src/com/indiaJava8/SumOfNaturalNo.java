package com.indiaJava8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfNaturalNo {
    public static void main(String[] args) {

        IntStream.range(1,10).sum();

        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        List<Integer> collect = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.reverse(collect);
        System.out.println(collect);
    }
}
