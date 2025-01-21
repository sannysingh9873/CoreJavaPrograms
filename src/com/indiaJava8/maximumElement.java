package com.indiaJava8;

import java.util.Arrays;
import java.util.List;

public class maximumElement {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer maxNum = myList.stream().max(Integer::compareTo).get();
        System.out.println(maxNum);
    }
}
