package com.codegym.task.task16.task1622;

/* 
Consecutive threads

*/

public class Solution {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            SleepingThread sleepingThread = new SleepingThread();
            //write your code here
            sleepingThread.join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //write your code here
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
