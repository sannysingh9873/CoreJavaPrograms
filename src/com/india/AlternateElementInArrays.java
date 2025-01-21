package com.india;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlternateElementInArrays {
    public static void main(String[] args) {

        List<Integer> arrsList = Arrays.asList(1,2,3,4,5,8,9,10);

        for(int i=0;i<arrsList.size(); i+=2){
            System.out.println(arrsList.get(i));
        }


    }

}


