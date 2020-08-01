package com.codegym.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //write your code here
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //write your code here
        f.join();
        System.out.println(f.getFileContents());
    }

    public interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContents();
        void join() throws InterruptedException;
        void start();
    }

    //write your code here
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private ArrayList<String> content;

        public ReadFileThread() {
            this.fileName = null;
            this.content = new ArrayList<>();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContents() {
            StringBuffer strBuffer = new StringBuffer();
            for (String s : content) {
                strBuffer.append(s).append(" ");
            }
            return strBuffer.toString();
        }

        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                while (fileReader.ready()) {
                    content.add(fileReader.readLine());
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File " + fileName + " not found");
            } catch (IOException e) {
                System.out.println("File " + fileName + " can't read");
            }
        }

    }
}
