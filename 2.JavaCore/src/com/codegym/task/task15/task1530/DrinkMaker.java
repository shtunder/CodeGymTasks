package com.codegym.task.task15.task1530;

public abstract class DrinkMaker {
    public abstract void getRightCup();
    public abstract void addIngredients();
    public abstract void pour();

    public void makeDrink() {
        getRightCup();
        addIngredients();
        pour();
    }

}
