package com.codegym.task.task13.task1322;

/* 
SimpleObject interface

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {

        @Override
        public SimpleObject<String> getInstance() {
            return this;
        }
    }
}
