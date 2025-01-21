package com.indiaJava8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindAge {
    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1988, 06, 15);

        LocalDate todayDate= LocalDate.now();

        long between = ChronoUnit.YEARS.between(birthDay, todayDate);
        System.out.println(between);
        int nums1[] ={1,2,3,0,0,0};
        int nums2[] ={2,5,6};
      //  Integer[] toArray = (Integer[]) Stream.of(nums1, nums2).toArray();


        Stream<Integer> integerStream = Arrays.stream(nums1).boxed();
        Stream<Integer> integerStream2 = Arrays.stream(nums2).boxed();
        Integer[] integers = Stream.concat(integerStream, integerStream2).sorted().filter(p -> p>0).toArray(Integer[]::new);

        for (int a:integers) {
            System.out.print(" "+a);
        }
        //System.out.println(Arrays.toString(merge(nums1, 6, nums2, 3)));


    }

}
