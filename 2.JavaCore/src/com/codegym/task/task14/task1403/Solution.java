package com.codegym.task.task14.task1403;

/* 
Building and School

*/

public class Solution {
    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //write your code here
        return new School();
    }

    public static Building getBuilding() {
        //write your code here
        return new Building();
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building  {
        @Override
        public String toString() {
            return "Building";
        }
    }
}
