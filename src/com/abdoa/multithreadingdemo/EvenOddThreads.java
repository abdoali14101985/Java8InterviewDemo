package com.abdoa.multithreadingdemo;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddThreads {

    private static Object object = new Object();

    private static IntPredicate evenCondition = e -> e%2==0;
    private static IntPredicate oddCondition = e -> e%2!=0;

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> EvenOddThreads.printNumber(oddCondition));
        CompletableFuture.runAsync(() -> EvenOddThreads.printNumber(evenCondition));
        Thread.sleep(1000);

    }

    public static void printNumber(IntPredicate codition){
        IntStream.rangeClosed(1, 10).filter(codition).forEach(EvenOddThreads::execute);
    }

    public static void execute(int n){
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+" : "+n);
            object.notify();
            try {
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
