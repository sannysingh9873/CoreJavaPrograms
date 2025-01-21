package com.india;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoArrayList {
    public static void main(String[] args) {

        List<Integer> al1= new ArrayList<>();

        List<Integer> al2= new ArrayList<>();

        al1.add(19);
        al1.add(2);
        al1.add(1);
        al1.add(5);
        al1.add(4);
        al1.add(8);

        al2.add(0);
        al2.add(12);
        al2.add(1);
        al2.add(6);
        al2.add(3);
        al2.add(2);


        List<Integer> collect1 = Stream.concat(al1.stream(), al2.stream()).sorted()
                .collect(Collectors.toList());
        System.out.println(collect1);


        al1.addAll(al2);
        System.out.println(al2);
        List<Integer> collect = al1.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);



    }

}


