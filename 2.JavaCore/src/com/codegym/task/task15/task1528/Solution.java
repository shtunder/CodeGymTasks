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

    //add your code below - добавь код ниже
    public static class Euro extends Money {
        public double amount = 123d;

        public Euro getMoney() {
            return this;
        }

        public Double getAmount() {
            return amount;
        }
    }
}

