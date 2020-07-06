package com.codegym.task.task16.task1615;

/* 
Airport

*/

public class Solution {
    public static volatile Runway RUNWAY = new Runway();   // 1 runway

    public static void main(String[] args) throws InterruptedException {
        Plane plane1 = new Plane("Plane #1");
        Plane plane2 = new Plane("Plane #2");
        Plane plane3 = new Plane("Plane #3");
    }

    private static void waitForTakeoff() {
        // write your code here
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }

    private static void takeOff() {
        // Fix this method
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }

    public static class Plane extends Thread {
        public Plane(String name) {
            super(name);
            start();
        }

        public void run() {
            boolean hasAlreadyTakenOff = false;
            while (!hasAlreadyTakenOff) {
                if (RUNWAY.trySetCurrentPlane(this)) {    // if the runway is available, we'll take it
                    System.out.println(getName() + " is flying");
                    takeOff();// is flying
                    System.out.println(getName() + " in the sky");
                    hasAlreadyTakenOff = true;
                    RUNWAY.setCurrentPlane(null);
                } else if (!this.equals(RUNWAY.getCurrentPlane())) {  // if the runway is occupied by a plane
                    System.out.println(getName() + " is waiting");
                    waitForTakeoff(); // is waiting
                }
            }
        }
    }

    public static class Runway {
        private Thread t;

        public Thread getCurrentPlane() {
            return t;
        }

        public void setCurrentPlane(Thread t) {
            synchronized (this) {
                this.t = t;
            }
        }

        public boolean trySetCurrentPlane(Thread t) {
            synchronized (this) {
                if (this.t == null) {
                    this.t = t;
                    return true;
                }
                return false;
            }
        }
    }
}

