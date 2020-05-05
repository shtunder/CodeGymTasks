package com.codegym.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Janitorial services

*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        // Write your implementation of Items 1-4 here
        for (Apartment apt : apartments) {
            if (apt instanceof OneRoomApt){
                ((OneRoomApt) apt).clean1Room();
            }
            if (apt instanceof TwoRoomApt) {
                ((TwoRoomApt) apt).clean2Rooms();
            }
            if (apt instanceof ThreeRoomApt) {
                ((ThreeRoomApt) apt).clean3Rooms();
            }
        }

    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room has been cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms have been cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms have been cleaned");
        }
    }
}
