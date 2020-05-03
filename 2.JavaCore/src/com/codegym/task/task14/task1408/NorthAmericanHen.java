package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 10;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " I come from " + NORTHAMERICA + ". I lay " + this.getMonthlyEggCount() + " eggs a month." );
    }
}
