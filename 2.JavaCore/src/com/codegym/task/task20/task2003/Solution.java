package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Introducing properties

*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        // Implement this method
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream in = new FileInputStream(filename);

        load(in);

        reader.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        // Implement this method
    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method
    }

    public static void main(String[] args) {

    }
}
