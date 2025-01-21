package com.indiaJava8;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumAllDigits {
    public static void main(String[] args) {
        int i = 15623;
        String s = String.valueOf(i);
        Integer sum = 0;
        int sum1 = Arrays.stream(s.split("")).
                map(Integer::parseInt).mapToInt(Integer::intValue).sum();

        int sum2 = Arrays.stream(s.split("")).
                map(Integer::parseInt).collect(Collectors.summingInt(value -> value));

        System.out.println(sum1);
        System.out.println(sum2);
       Arrays.stream(s.split("")).
                map(Integer::parseInt).forEach(System.out::print);


    }
}
