package com.codegym.task.task16.task1602;

/* 
My second thread

*/

public class Solution {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("This is the static block inside TestThread");
        }

        @Override
        public void run() {
            System.out.println("This is the run method");
        }
    }
}
