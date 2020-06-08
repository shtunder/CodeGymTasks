package com.codegym.task.task15.task1530;

public class TeaMaker extends DrinkMaker {
    @Override
    public void getRightCup() {
        System.out.println("Grab a cup for tea");
    }

    @Override
    public void addIngredients() {
        System.out.println("Add tea leaves");
    }

    @Override
    public void pour() {
        System.out.println("Fill with boiling water");
    }
}
