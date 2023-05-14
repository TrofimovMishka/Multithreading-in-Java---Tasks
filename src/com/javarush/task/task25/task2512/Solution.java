package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.List;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        List<Throwable> throwables = new ArrayList<>();
        Throwable cause = e.getCause();
        while (cause  != null){
            throwables.add(0, cause);
            cause = cause.getCause();
        }

        throwables.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Thread tr = new Thread(() -> {
                throw new Error( new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI"))));
        });
        tr.setUncaughtExceptionHandler(new Solution());
        tr.start();
    }
}
