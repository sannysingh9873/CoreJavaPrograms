package com.india;

public class FunctionalInterface
{
    public static void main(String[] args) {
        functionalExample fc = (a,b) -> {
            System.out.println(a+b);
        };
        fc.add(5,6);
    }

}

interface  functionalExample{
    public  void add(int a, int b);

}