package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> divisibleBy2 = new ArrayList<>();
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> other = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (x % 2 == 0 || x % 3 == 0){
                if (x % 3 == 0)
                    divisibleBy3.add(x);
                if (x % 2 == 0)
                    divisibleBy2.add(x);
            }
            else
                other.add(x);



        }
        printList(divisibleBy3);
        printList(divisibleBy2);
        printList(other);

    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}