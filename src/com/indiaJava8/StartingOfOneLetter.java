package com.indiaJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingOfOneLetter {
    public static void main(String[] args) {

        List<Integer> lisInt= Arrays.asList(11,22,33,45,23,87,10);
        List<String> collect = lisInt.stream().map(p -> p + "").filter(p -> p.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);
    }
}
