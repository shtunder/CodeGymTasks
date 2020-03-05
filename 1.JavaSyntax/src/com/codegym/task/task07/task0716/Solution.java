package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("lofr");
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("utsl");



        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here

//        for (int i = 0; i < list.size(); i++) {
//            String s = list.get(i);
//            if (s.contains("r") && !s.contains("l")) {
//                list.remove(i);
//            }
//
//        }
//
//        for (int i = 0; i < list.size();){
//            String s = list.get(i);
//            if (s.contains("l") && !s.contains("r")){
//                list.add(i+1, s);
//                i+=2;
//            }
//            else{
//                i+=1;
//            }
//
//        }

        for (int i = list.size()-1; i>=0; i--) {
            if (list.get(i).indexOf("r")>=0 && list.get(i).indexOf("l")==-1)
                list.remove(i);
        }
        //Duplicate word with "л"
        for (int i = list.size()-1; i>=0; i--) {
            if (list.get(i).indexOf("l")>=0 && list.get(i).indexOf("r")==-1)
                list.add(list.get(i));
        }
        return list;
    }
}