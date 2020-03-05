package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int tmpMin =-1, tmpMax=0;
        for (int i=0; i<10; i++){
            String s = reader.readLine();
            if (s.length() < tmpMin || tmpMin==-1){
                tmpMin=s.length();
            }
            if (s.length()> tmpMax){
                tmpMax=s.length();
            }
            list.add(s);
        }
        int longest = 0, shortest = 0;

        for (int i=0; i<list.size(); i++){
            if(tmpMax == list.get(i).length()){
                longest = i;
                break;
            }
        }
            for (int i=0; i<list.size(); i++){
            if(tmpMin == list.get(i).length()){
                shortest = i;
                break;
            }
        }

        if (longest<shortest){
            System.out.println(list.get(longest));
        }
        if (shortest<longest){
            System.out.println(list.get(shortest));
        }

    }
}
