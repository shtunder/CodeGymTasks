package com.codegym.task.task05.task0521;

/* 
Calling a constructor from a constructor

*/

public class Circle {

    public double x;
    public double y;
    public double radius;
    public double radius2;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //write your code here
        this(x, y, 10);
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
