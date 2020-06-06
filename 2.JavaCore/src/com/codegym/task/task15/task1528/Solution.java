package com.codegym.task.task15.task1528;

/* 
OOP: The Euro is money too

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Euro().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    // Add your code below
    public static class Euro extends Money {
        private double amount = 123d;

        public Euro getMoney() {
            return this;
        }

        public Double getAmount() {
            return amount;
        }

    }
}
