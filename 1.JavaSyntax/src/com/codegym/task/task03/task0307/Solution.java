package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "Azerg";
        zerg2.name = "Bzerg";
        zerg3.name = "Czerg";
        zerg4.name = "Dzerg";
        zerg5.name = "Ezerg";

        Protoss pr1 = new Protoss();
        pr1.name = "Apr";
        Protoss pr2 = new Protoss();
        pr2.name = "Bpr";
        Protoss pr3 = new Protoss();
        pr3.name = "Cpr";

        Terran terran1 = new Terran();
        terran1.name = "Atr";
        Terran terran2 = new Terran();
        terran2.name = "Btr";
        Terran terran3 = new Terran();
        terran3.name = "Ctr";
        Terran terran4 = new Terran();
        terran4.name = "Dtr";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
