package com.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Reading and writing to a file: CodeGym

*/

public class Solution {
    public static void main(String[] args) {
        // You can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // Initialize users field for the codeGym object here
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // Here check that the codeGym object is equal to the loadedObject object
            System.out.println(codeGym.equals(loadedObject));

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }

    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            // Implement this method
            PrintWriter printWriter = new PrintWriter(outputStream);
            if (this.users.size() > 0) {
                for (User current : this.users) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(current.getFirstName());
                    sb.append("/");
                    sb.append(current.getLastName());
                    sb.append("/");
                    sb.append(current.getBirthDate().getTime());
                    sb.append("/");
                    sb.append(current.isMale());
                    sb.append("/");
                    sb.append(current.getCountry());

                    printWriter.println(sb.toString());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            // Implement this method
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return users != null ? users.equals(codeGym.users) : codeGym.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
