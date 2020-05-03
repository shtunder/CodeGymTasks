package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 14;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " I come from " + EUROPE + ". I lay " + this.getMonthlyEggCount() + " eggs a month." );
    }
}
