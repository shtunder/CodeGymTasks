package com.codegym.task.task15.task1530;

public class LatteMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Grab a cup for latte");
    }

    @Override
    public void addIngredients() {
        System.out.println("Make coffee");
    }

    @Override
    public void pour() {
        System.out.println("Fill with foamy milk");
    }
}
