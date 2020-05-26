package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {
        readKeyFromConsoleAndInitPlanet();
        System.out.println(thePlanet);
    }

    public static Planet thePlanet;

    // Add static block here
    static {

    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            if (s.equals(Planet.EARTH)) {
                thePlanet = Earth.getEarth();
            } else if (s.equals(Planet.MOON)) {
                thePlanet = Moon.getMoon();
            } else if (s.equals(Planet.SUN)) {
                thePlanet = Sun.getSun();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
