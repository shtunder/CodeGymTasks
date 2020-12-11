package com.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Reinforce the adapter

*/

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    public static void main(String[] args) {

    }

    public static class DataAdapter {
        public DataAdapter(Customer customer, Contact contact) {
        }
    }

    public static interface RowItem {
        String getCountryCode();        // For example: US

        String getCompany();            // For example: CodeGym Ltd.

        String getContactFirstName();   // For example: John

        String getContactLastName();    // For example: Peterson

        String getDialString();         // For example: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // For example: CodeGym Ltd.

        String getCountryName();        // For example: United States
    }

    public static interface Contact {
        String getName();               // For example: Peterson, John

        String getPhoneNumber();        // For example: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}