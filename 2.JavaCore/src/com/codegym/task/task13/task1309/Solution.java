package com.codegym.task.task13.task1309;

/* 
All that moves

*/

public class Solution {
    public static void main(String[] args) {
    }

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove{
        Double speed(CanFly fly);
    }
}