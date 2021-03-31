package com.codegym.task.task20.task2021;

import java.io.*;

/* 
Serialization is prohibited

*/

public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException {
            throw new NotSerializableException("Not today!");
        }

        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            throw new NotSerializableException("Not today!");
        }
    }

    public static void main(String[] args) {

    }
}
