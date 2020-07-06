package com.codegym.task.task16.task1608;

/* 
Promotion during political debates

*/

public class Solution {
    public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician chump = new Politician("Chump");
        chump.join();
        Politician dustbin = new Politician("Dustbin");
        Politician schooner = new Politician("Schooner");

        while (chump.getSpeechCount() + dustbin.getSpeechCount() + schooner.getSpeechCount() < totalSpeechCount) {
        }

        System.out.println(chump);
        System.out.println(dustbin);
        System.out.println(schooner);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s spoke %d times", getName(), getSpeechCount());
        }
    }
}

