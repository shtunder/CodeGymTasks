package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            file.write(s);
            file.newLine();
        }

        file.close();
        reader.close();
    }
}


//public class Solution {
//    public static void main(String[] args) {
//        // write your code here
//        BufferedReader reader = null;
//        InputStream inputStream = null;
//        BufferedInputStream buffer = null;
//        OutputStream outputStream = null;
//
//        try {
//            reader = new BufferedReader(new InputStreamReader(System.in));
//            String s = reader.readLine();
//
//
//
//            while (true){
//                String str = reader.readLine();
//                byte[] arr = str.getBytes();
//
//                if (str.equals("exit")) {
//                    break;
//                }
//            }
//
//            inputStream = new ByteArrayInputStream();
//            buffer = new BufferedInputStream(inputStream);
//
//            outputStream = new FileOutputStream(s);
//            while (buffer.available()>0) {
//                int data = buffer.read();
//                outputStream.write(data);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//
//
//        }
//
//    }
//}
