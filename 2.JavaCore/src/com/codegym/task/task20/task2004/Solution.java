package com.codegym.task.task20.task2004;


import java.io.*;

/* 
Reading and writing static fields to a file

*/

public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {

            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            // Here check that the classWithStatic object is equal to the loadedObject object
            System.out.println(loadedObject.equals(classWithStatic));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(staticString);
            printWriter.println(this.i);
            printWriter.println(this.j);
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            staticString = bufferedReader.readLine();
            this.i = Integer.parseInt(bufferedReader.readLine());
            this.j = Integer.parseInt(bufferedReader.readLine());
            bufferedReader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
