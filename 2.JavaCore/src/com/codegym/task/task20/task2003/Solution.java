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
        Properties prop = new Properties();

        for (Map.Entry<String, String> pair : properties.entrySet()) {
            prop.setProperty(pair.getKey(), pair.getValue());
        }

        prop.store(outputStream, null);

        outputStream.close();

    }

    public void load(InputStream inputStream) throws Exception {
        // Implement this method
        Properties prop = new Properties();
        prop.load(inputStream);
        for (Map.Entry<Object, Object> pair : prop.entrySet()) {
            properties.put(pair.getKey().toString(), pair.getValue().toString());
        }

        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
