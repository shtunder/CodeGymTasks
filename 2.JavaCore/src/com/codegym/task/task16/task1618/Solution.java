package com.codegym.task.task16.task1618;

/* 
Another interruption

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //write your code here
        TestThread testThread = new TestThread();
        Thread thread = new Thread(testThread);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }

    //write your code here
    public static class TestThread implements Runnable{
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while (!current.isInterrupted()) {
                System.out.println("I am another thread");
            }
        }
    }
}