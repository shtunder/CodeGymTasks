package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Ivanov Ivan", new Date()));  // id=0
        allPeople.add(Person.createMale("Petrov Petr", new Date()));  // id=1
    }

    public static void main(String[] args) {
        //start here
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {

            //create person
            case "-c":
                for (int step = 1; step < args.length; step += 3) {
                    Date date = null;
                    try {
                        date = dateFormat.parse(args[step + 2]);
                    } catch (ParseException e) {
                        e.getMessage();
                    }

                    Person person;
                    if (args[step + 1].startsWith("m"))
                        person = Person.createMale(args[step], date);
                    else
                        person = Person.createFemale(args[step], date);

                    synchronized (allPeople) {
                        allPeople.add(person);
                    }

                    System.out.println(allPeople.indexOf(person));
                }
                break;

            //update person
            case "-u": {
                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step += 4) {
                        int index = Integer.parseInt(args[step]);
                        Person person = allPeople.get(index);

                        //update name
                        person.setName(args[step + 1]);

                        //update date
                        Date date = null;
                        try {
                            date = dateFormat.parse(args[step + 3]);
                        } catch (ParseException e) {
                            e.getMessage();
                        }
                        person.setBirthDay(date);

                        //update sex
                        if (args[step + 2].startsWith("m"))
                            person.setSex(Sex.MALE);
                        else
                            person.setSex(Sex.FEMALE);
                    }
                } //synchronized
                break;
            }

            //remove person
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);

                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDay(null);
                    }
                }
                break;
            }

            //print person
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        StringBuffer s = new StringBuffer();
                        s.append(person.getName());
                        s.append(" ");
                        s.append(person.getSex() == Sex.MALE ? "m" : "w");
                        s.append(" ");
                        s.append(dateFormatPrt.format(person.getBirthDay()));
                        System.out.println(s);
                    }
                }
            }
            break;
        }

        //For DEBUG
        /*for (Person person : allPeople) {
            StringBuffer s = new StringBuffer();
            s.append(person.getName());
            s.append(" ");
            s.append(person.getSex() == Sex.MALE ? "m" : "w");
            s.append(" ");
            if (person.getBirthDay()!=null)
                s.append(dateFormatPrt.format(person.getBirthDay()));
            System.out.println(s);
        }*/

    }
}
