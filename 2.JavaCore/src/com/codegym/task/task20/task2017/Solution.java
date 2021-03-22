package com.codegym.task.task20.task2017;

import java.io.ObjectInputStream;

/* 
Deserialization

*/

public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        return null;
    }

    public class A {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
