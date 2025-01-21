package com.india;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapTest {

    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();

        list1.add("chennai");
        list1.add("hyd");
        list1.add("chennai");
        list1.add("patna");
        list1.add("Bangalore");
        list1.add("patna");

        HashSet<String> hs=new HashSet<>();
        List<String> filterList = list1.stream().filter(s -> !hs.add(s)).collect(Collectors.toList());
   /*     System.out.println(list1);
        System.out.println(filterList);*/

        String str= "i am very good boy i worked on good IT company i live in bangalore";

        String[] spiltString =str.split(" ");
        System.out.println(str);
        System.out.println(spiltString);
        Map<String, Long> frequencyMap = Arrays.stream(spiltString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Long max = Collections.max(frequencyMap.values());
        Map<String, Long> maxMap = frequencyMap.entrySet().stream().filter(s -> s.getValue().equals(max))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(max);
        System.out.println(maxMap);
    }
}
