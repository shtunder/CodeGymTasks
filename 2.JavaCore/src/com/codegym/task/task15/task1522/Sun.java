package com.codegym.task.task15.task1522;

public class Sun implements Planet {
    private static Sun sun;

    private Sun() {}

    public static Sun getSun(){
        if (sun == null) {
            sun = new Sun();
        }
        return sun;
    }
}
