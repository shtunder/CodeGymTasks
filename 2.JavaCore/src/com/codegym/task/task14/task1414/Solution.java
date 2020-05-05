package com.codegym.task.task14.task1414;

/* 
MovieFactory

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read several keys (strings) from the console. Item 7
        String key = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            key = reader.readLine();
            if (!(key.equals("soapOpera") || key.equals("cartoon") || key.equals("thriller")))
                break;
            Movie movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
        }
        /*
            8. Create a variable movie in the Movie class, and for each entered string (key):
            8.1. Get an object using MovieFactory.getMovie and assign it to the variable movie.
            8.2. Display the result of calling movie.getClass().getSimpleName().
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Create a SoapOpera object for the key "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //write your code here. Items 5, 6
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    // Write your classes here. Item 3
    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
