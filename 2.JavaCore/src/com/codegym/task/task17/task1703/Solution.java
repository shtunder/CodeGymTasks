package com.codegym.task.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Synchronized notes

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();

        public void addNote(int index, String note) {
            System.out.println("A note [" + note + "] will now be added at position " + index);
            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("The note [" + note + "] has already been added");
        }

        public void removeNote(int index) {
            System.out.println("A note will now be deleted from position " + index);
            String note = null;
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("The note [" + note + "] has already been deleted from position " + index);
        }
    }

}
