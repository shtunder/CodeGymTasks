package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas

*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //write your code here
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        public String getDescription(){
            return "Be your own tyrant";
        }
    }
}

