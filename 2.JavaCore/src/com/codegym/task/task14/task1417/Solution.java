package com.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Currencies

*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;
        private List<Money> allMoney;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            allMoney.add(new Euro(36.56));
            allMoney.add(new Ruble(2935.83));
            allMoney.add(new USD(39.5));
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
