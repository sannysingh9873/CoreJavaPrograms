package com.indiaJava8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {

    public static void main(String[] args) {

        String s = "string data to count each character";
        String[] splitchar = s.split("");
        for (String c:splitchar ) {
            System.out.print(c);
        }


        LinkedHashMap<String, Long> collect = Arrays.stream(splitchar).map(String::toLowerCase)
                .collect(Collectors.groupingBy(p -> p, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);

    }



}
