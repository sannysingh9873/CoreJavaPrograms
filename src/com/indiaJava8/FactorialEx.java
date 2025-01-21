package com.indiaJava8;

public class FactorialEx {
    public static void main(String[] args) {
        int fact=getFactorial(5);
        System.out.println(fact);
    }

    private static int getFactorial(int i) {
        int fact=1;
        for (int j = 2; j <= i; j++) {
            fact=fact*j;
        }

        return fact;
    }
}

//5*4*3*2*1