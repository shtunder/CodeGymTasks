package com.codegym.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Word search

*/

public class Solution {
    public static void main(String[] args) {
        int[][] wordSearch = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(wordSearch, "home", "same");
        /*
Expected result
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] wordSearch, String... words) {

        ArrayList<Word> result = new ArrayList<>();
        int hor = wordSearch[0].length;
        int ver = wordSearch.length;

        outer:
        for (String s : words) {
            // Horizontally
            for (int i = 0; i < ver; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < hor; j++)
                    sb.append((char) wordSearch[i][j]);

                String horLine = sb.toString();
                if (horLine.contains(s)) {
                    Word word = new Word(s);
                    word.setStartPoint(horLine.indexOf(s), i);
                    word.setEndPoint(horLine.indexOf(s) + s.length() - 1, i);

                    result.add(word);
                    continue outer;
                }
                String horReverse = sb.reverse().toString();
                if (horReverse.contains(s)) {
                    Word word = new Word(s);
                    word.setStartPoint(hor - horReverse.indexOf(s) - 1, i);
                    word.setEndPoint(hor - horReverse.indexOf(s) - s.length(), i);

                    result.add(word);
                    continue outer;
                }
            }
            // Vertically
            for (int i = 0; i < hor; i++) {
                StringBuilder sb = new StringBuilder();
                for (int[] aCrossword : wordSearch)
                    sb.append((char) aCrossword[i]);

                String horLine = sb.toString();
                if (horLine.contains(s)) {
                    Word word = new Word(s);
                    word.setStartPoint(i, horLine.indexOf(s));
                    word.setEndPoint(i, horLine.indexOf(s) + s.length() - 1);

                    result.add(word);
                    continue outer;
                }
                String horReverse = sb.reverse().toString();
                if (horReverse.contains(s)) {
                    Word word = new Word(s);
                    word.setStartPoint(i, ver - horReverse.indexOf(s) - 1);
                    word.setEndPoint(i, ver - s.length() - horReverse.indexOf(s));

                    result.add(word);
                    continue outer;
                }
            }

            // Diagonally to the right
            for (int i = 0; i < ver; i++) {
                for (int j = 0; j < hor; j++) {
                    int iTemp = i;
                    int jTemp = j;
                    StringBuilder sb = new StringBuilder();
                    while (iTemp < ver && jTemp < hor) {
                        sb.append((char) wordSearch[iTemp][jTemp]);
                        iTemp++;
                        jTemp++;
                    }
                    String horLine = sb.toString();
                    if (horLine.contains(s)) {
                        Word word = new Word(s);
                        word.setStartPoint(j + horLine.indexOf(s), i + horLine.indexOf(s));
                        word.setEndPoint(j + horLine.indexOf(s) + s.length() - 1, i + horLine.indexOf(s) + s.length() - 1);

                        result.add(word);
                        continue outer;
                    }
                    String horReverse = sb.reverse().toString();
                    if (horReverse.contains(s)) {
                        Word word = new Word(s);
                        word.setStartPoint(jTemp - 1 - horReverse.indexOf(s), iTemp - 1 - horReverse.indexOf(s));
                        word.setEndPoint(jTemp - horReverse.indexOf(s) - s.length(), iTemp - horReverse.indexOf(s) - s.length());

                        result.add(word);
                        continue outer;
                    }
                }
            }

            // Diagonally to the left
            for (int i = 0; i < ver; i++) {
                for (int j = hor - 1; j >= 0; j--) {
                    int iTemp = i;
                    int jTemp = j;
                    StringBuilder sb = new StringBuilder();
                    while (iTemp < ver && jTemp >= 0) {
                        sb.append((char) wordSearch[iTemp][jTemp]);
                        iTemp++;
                        jTemp--;
                    }

                    String horLine = sb.toString();
                    if (horLine.contains(s)) {
                        Word word = new Word(s);
                        word.setStartPoint(j - horLine.indexOf(s), i + horLine.indexOf(s));
                        word.setEndPoint(j - horLine.indexOf(s) - s.length() + 1, i + horLine.indexOf(s) + s.length() - 1);

                        result.add(word);
                        continue outer;
                    }
                    String horReverse = sb.reverse().toString();
                    if (horReverse.contains(s)) {
                        Word word = new Word(s);
                        word.setStartPoint(jTemp + 1 + horReverse.indexOf(s), iTemp - 1 - horReverse.indexOf(s));
                        word.setEndPoint(jTemp + horReverse.indexOf(s) + s.length(), iTemp - horReverse.indexOf(s) - s.length());

                        result.add(word);
                        continue outer;
                    }
                }
            }
        }

        System.out.println(result);

        return result;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
