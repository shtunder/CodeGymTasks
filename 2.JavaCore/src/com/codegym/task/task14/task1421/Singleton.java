package com.codegym.task.task14.task1421;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        this.instance = this;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            new Singleton();
        }
        return instance;
    }
}
