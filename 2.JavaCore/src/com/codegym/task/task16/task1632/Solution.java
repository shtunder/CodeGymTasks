package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new ThreadInfinitely("Infinitely"));
        threads.add(new ThreadInterrupted("Thread Interrupted"));
        threads.add(new ThreadHurray("Thread Hurray"));
        threads.add(new ThreadMessage("Thread Message"));
        threads.add(new ThreadNumberInputs("Thread Number Inputs"));
    }

    public static void main(String[] args) {
        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static class ThreadInfinitely extends Thread {
        public ThreadInfinitely(String name) {
            super(name);
        }

        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class ThreadInterrupted extends Thread {

        public ThreadInterrupted(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThreadHurray extends Thread {
        public ThreadHurray(String name) {
            super(name);
        }

        @Override
        public void run() {
            try {
                while(true) {
                    System.out.println("Hurray");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class ThreadMessage extends Thread implements Message {
        private boolean isAlive;

        public ThreadMessage(String name) {
            super(name);
            this.isAlive = true;
        }

        @Override
        public void run() {
            while (isAlive) {
            }
        }

        @Override
        public void showWarning() {
            isAlive = false;
        }
    }

    public static class ThreadNumberInputs extends Thread {

        public ThreadNumberInputs(String name) {
            super(name);
        }

        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = null;
            int sum = 0;
            while (true) {
                try {
                    s = reader.readLine();
                } catch(IOException e){
                    e.printStackTrace();
                }
                sum += Integer.parseInt(s);
                if (s.equals("N")) {
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}