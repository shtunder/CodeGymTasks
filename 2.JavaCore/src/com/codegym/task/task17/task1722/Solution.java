package com.codegym.task.task17.task1722;

/* 
Let's count

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread started...");

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        counter1.start();
        counter2.start();
        counter3.start();
        counter4.start();

        counter1.join();
//        counter2.join();
//        counter3.join();
//        counter4.join();



        for (int i = 1; i <= 100; i++) {
            if (values[i] != 1) {
                System.out.println("The values array contains elements not equal to 1");
                break;
            }
        }

        System.out.println("Main thread finished...");
    }

    public static Integer count = 0;
    public static int[] values = new int[105];

    static {
        for (int i = 0; i < 105; i++) {
            values[i] = 0;
        }
    }

    public static void incrementCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static class Counter extends Thread {
        @Override
        public void run() {
            do {
                synchronized (Solution.class) {
                    incrementCount();
                    values[getCount()]++;
                }

                try {
                    Thread.sleep(1);
                } catch (InterruptedException ignored) {
                }
            } while (getCount() < 100);

            System.out.printf("%s started... \n", Thread.currentThread().getName());
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        }
    }
}
