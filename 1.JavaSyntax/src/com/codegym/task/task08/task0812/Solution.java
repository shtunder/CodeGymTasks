package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < 10; i++){
            String s = bufferedReader.readLine();
            int a = Integer.parseInt(s);
            arrayList.add(a);
        }
//        int n = 1;
//        int m = 0;
        int count = 1;
        int max_count = 1;
        for (int i = 1; i < 10; i++){
//            if (arrayList.get(i)==arrayList.get(i-1)){
//                n++;
//            }
//            else if (m<n){
//                m = n;
//                n = 1;
//            }
            if (arrayList.get(i-1)!=arrayList.get(i))
                count = 1;
            else {
                count++;
                if (count > max_count)
                    max_count = count;
            }

        }

//        System.out.println(m);
        System.out.println(max_count);

    }
}