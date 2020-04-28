package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader conReader = new BufferedReader(new InputStreamReader (System.in));
        ArrayList<Integer> vect = new ArrayList<>();

        try {
            BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(conReader.readLine()))));

            while (fileReader.ready()) {
                vect.add(Integer.parseInt(fileReader.readLine()));
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Can't read File");
        }

        Collections.sort (vect);

        for (Integer i : vect) {
            if (i % 2 == 0)
                System.out.println(i);
        }



    }
}
© 2020 GitHub, Inc.
