package com.india;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2="hello";
        String s3=s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1.hashCode());//false because reference variables are pointing to different instance
        System.out.println(s1.intern().hashCode());//false because reference variables are pointing to different instance

    }

}


