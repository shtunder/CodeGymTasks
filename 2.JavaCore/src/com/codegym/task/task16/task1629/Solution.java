package com.codegym.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //write your code here
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        System.out.println();
        t2.printResult();
    }

    //write your code here
    public static class Read3Strings extends Thread {
        private List<String> lst = new ArrayList<>();

        @Override
        public void run() {
            try {
                for (int i = 0; i < 3; i++) {
                    lst.add(reader.readLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            for (String s : lst) {
                System.out.print(s + " ");
            }
        }
    }
}
