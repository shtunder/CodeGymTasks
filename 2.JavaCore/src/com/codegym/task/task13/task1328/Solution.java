package com.codegym.task.task13.task1328;

/* 
Robot wars

*/

public class Solution {
    public static void main(String[] args) {
        Robot amigo = new Robot("Amigo");
        Robot enemy = new Robot("Enemy");

        doMove(amigo, enemy);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
        doMove(enemy, amigo);
        doMove(amigo, enemy);
    }

    public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defended = robotFirst.defend();
        System.out.println(String.format("%s attacked %s: its %s was attacked, and its %s was defended",
                robotFirst.getName(), robotSecond.getName(), attacked, defended));
    }
}
