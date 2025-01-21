package com.indiaJava8;

import java.util.concurrent.*;

public class CallableExp {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService ex= Executors.newFixedThreadPool(5);
        for (int i = 0; i <4 ; i++) {
            Future submit = ex.submit(new callExample());

            System.out.println( submit.get());

        }
        ex.shutdown();
    }
}
class callExample implements Callable {

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("runnable : " + Thread.currentThread().getName()+":  ");
        return "Success";
    }
}
