package com.codegym.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }

    static {
        synchronized (OurPresident.class) {
            president = new OurPresident();
        }
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
