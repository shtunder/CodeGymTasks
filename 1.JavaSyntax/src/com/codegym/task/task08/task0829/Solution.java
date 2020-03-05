package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        List<Person> addresses = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String secondName = reader.readLine();
            if (secondName.isEmpty()) break;
            addresses.add(new Person(city, secondName));
        }

        // Read the house number
        String city = reader.readLine();
        for (Person person : addresses) {
            if (person.getCity().equals(city)) {
                System.out.println(person.getSecondName());
            }
        }
    }

    public static class Person {
        private String city;
        private String secondName;

        public Person(String city, String secondName) {
            this.city = city;
            this.secondName = secondName;
        }

        public String getCity() {
            return city;
        }

        public String getSecondName() {
            return secondName;
        }
    }
}

