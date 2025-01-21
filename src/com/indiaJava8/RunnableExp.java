package com.indiaJava8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExp {

    public static void main(String[] args) {

        ExecutorService ex= Executors.newFixedThreadPool(5);
        for (int i = 0; i <4 ; i++) {
            ex.submit(new runnableExample());

        }
        ex.shutdown();
    }
}


class runnableExample implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("runnable : " + Thread.currentThread().getName()+":  ");

    }
}
