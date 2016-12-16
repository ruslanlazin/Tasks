package ua.pp.lazin.exception;

import java.util.Arrays;

/**
 * @author Ruslan Lazin
 */
public class Task4 {

    public static void main(String[] args) {

       new Thread(new Runnable() {
           @Override
           public void run() {
               produceOutOfMemory();
           }
       }).start();

       new Thread(new Runnable() {
           @Override
           public void run() {
               produceStackOverflow();
           }
       }).start();
    }

    private static void produceStackOverflow() {
        produceStackOverflow();
    }

    private static void produceOutOfMemory() {
        Object[][][] objects = new Object[1000][1000][1000];

    }
}

