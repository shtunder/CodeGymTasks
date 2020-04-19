package com.codegym.task.task13.task1315;

/* 
Tom, Jerry and Spike

*/

public class Solution {
    public static void main(String[] args) {

    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }

    public static class Cat implements CanMove, Edible, CanEat {
        @Override
        public void eat() {
        }

        @Override
        public void move() {
        }

        @Override
        public void beEaten() {
        }
    }

    public static class Mouse implements CanMove, Edible {
        @Override
        public void move() {
        }

        @Override
        public void beEaten() {
        }
    }

    public static class Dog implements CanMove, CanEat {
        @Override
        public void move() {
        }

        @Override
        public void eat() {
        }
    }
}