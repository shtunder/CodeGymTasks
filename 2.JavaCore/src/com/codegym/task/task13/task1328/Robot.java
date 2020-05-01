package com.codegym.task.task13.task1328;

public class Robot extends AbstractRobot{
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
