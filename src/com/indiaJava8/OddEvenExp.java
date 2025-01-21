package com.indiaJava8;

import java.util.Arrays;
import java.util.List;

public class OddEvenExp {
    public static void main(String[] args) {

        List<Integer> listArr = Arrays.asList(10,15,8,49,25,98,32);

        listArr.stream().filter(arr -> arr%2!=0).forEach(System.out::println);
    }
}
