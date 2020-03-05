package com.codegym.task.task06.task0602;

/* 
Zombie cats, zombie dogs

*/

public class Cat {
    public static void main(String[] args) {

    }

    //write your code here
    protected void finalize() throws Throwable {
        System.out.println("A Cat was destroyed");
    }

}

class Dog {
    //write your code here
    protected void finalize() throws Throwable {
        System.out.println("A Dog was destroyed");
    }
}
