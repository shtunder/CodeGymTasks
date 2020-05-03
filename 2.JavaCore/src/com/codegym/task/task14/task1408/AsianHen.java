package com.codegym.task.task14.task1408;

public class AsianHen extends Hen {
    @Override
    public int getMonthlyEggCount() {
        return 8;
    }

    @Override
    public String getDescription() {
        return (super.getDescription() + " I come from " + ASIA + ". I lay " + this.getMonthlyEggCount() + " eggs a month." );
    }
}
