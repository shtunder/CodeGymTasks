package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            if (continent.equals(Continent.NORTHAMERICA))
                hen = new NorthAmericanHen();
            else if (continent.equals(Continent.EUROPE))
                hen = new EuropeanHen();
            else if (continent.equals(Continent.ASIA))
                hen = new AsianHen();
            else if (continent.equals(Continent.AFRICA))
                hen = new AfricanHen();

            return hen;
        }

    }
}
