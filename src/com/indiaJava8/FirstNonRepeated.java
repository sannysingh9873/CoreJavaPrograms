package com.indiaJava8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String args[]) {
        String input = "ava articles are Awesome";
        LinkedHashMap<Character, Long> collect = input.chars().mapToObj(s -> Character.toLowerCase((char) s))
                .filter( p -> !p.equals(' ')).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        Character firstNonRepeated = collect.entrySet().stream().filter(p -> p.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(firstNonRepeated);

    }
}
