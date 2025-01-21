package com.indiaJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareCubeElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

        integerList.stream().map(p ->p*p).map(p -> p+" ").forEach(System.out::print);

        List<String> collect = integerList.stream().map(p -> p * p * p).map(p -> p + " ").collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect);
    }
}
