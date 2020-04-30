package com.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Turnip

*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Turnip"));
        plot.add(new Person("Grandpa"));
        plot.add(new Person("Grandma"));
        plot.add(new Person("Granddaughter"));
        TurnipStory.tell(plot);
    }
}
