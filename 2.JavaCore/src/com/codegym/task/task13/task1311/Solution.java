package com.codegym.task.task13.task1311;

/* 
Let's hire a translator

*/

public class Solution {
    public static void main(String[] args) {
        RussianTranslator russianTranslator = new RussianTranslator();
        System.out.println(russianTranslator.translate());
    }

    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "I translate from " + getLanguage();
        }
    }

    public static class RussianTranslator extends Translator {
        @Override
        public String getLanguage() {
            return "Russian";
        }
    }

}