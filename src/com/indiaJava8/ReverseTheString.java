package com.indiaJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseTheString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String[] strArr=str.split(" ");


        List<StringBuffer> collect = Arrays.stream(strArr).map(s -> new StringBuffer(s).reverse())
        .collect(Collectors.toList());

        String collect1 = Arrays.stream(strArr).map(s -> new StringBuffer(s).reverse())
                .collect(Collectors.joining(" "));

        System.out.println(collect);
        System.out.println(collect1);

    }
}
