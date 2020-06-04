package com.codegym.task.task15.task1530;

/* 
Template pattern

*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker tea = new TeaMaker();
        DrinkMaker latte = new LatteMaker();
        tea.makeDrink();
        latte.makeDrink();
    }
}
