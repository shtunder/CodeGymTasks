package com.codegym.task.task06.task0605;


import java.io.*;

/* 
Controlling body weight

*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            // write your code here
            double a = weight/(height*height);
            if (a<18.5)
                System.out.println("Underweight: BMI < 18.5");
            if (a<=24.9 && a>=18.5)
                System.out.println("Normal: 18.5 <= BMI <= 24.9");
            if (a<=29.9 && a>=25)
                System.out.println("Overweight: 25 <= BMI <= 29.9");
            if (a>=30)
                System.out.println("Obese: BMI >= 30");
        }
    }
}
