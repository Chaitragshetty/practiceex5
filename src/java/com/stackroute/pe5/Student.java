//Create a Student class that represents the following information of a student: id, name, and age all the member variables should be private .
//a. Implement `getter and setter` .
//b. Create a `StudentSorter` class that implements `Comparator interface` .
//c. Write a class `Maintest` create Student class object(minimum 5)
//d. Add these student object into a List of type Student .
//e. Sort the list based on their age in decreasing order, for student having same age, sort based on their name.
//f. For students having same name and age, sort them according to their ID.
package com.stackroute;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//creating student class

    public class Student {
    private String id;
    private String name;
    private int age;


    Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}

//Implementing a comparator interface
class StudentSort implements Comparator {

    StudentSort() {
    }

    public int compare(Object o1, Object o2) {

        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.getAge() == s2.getAge()) {

            int answer = s1.getName().compareTo(s2.getName());
            return answer == 0 ? s1.getID().compareTo(s2.getID()) : answer;
        } else {
            return s1.getAge() > s2.getAge() ? 1 : -1;
        }
    }
}

//Printing the array in sorted manner
class Main {
    Main() {
    }

    public static void main(String[] args) {

        List<Student> listofstudents = new ArrayList();

        listofstudents.add(new Student("2", "chaitra", 20));
        listofstudents.add(new Student("7", "Anu", 25));
        listofstudents.add(new Student("5", "deepali", 25));
        listofstudents.add(new Student("5", "deepa", 25));
        listofstudents.add(new Student("10", "sja", 19));

        Collections.sort(listofstudents, new StudentSort());

        for (int i = 0; i < listofstudents.size(); ++i) {

            PrintStream var1 = System.out;
            String var2 = listofstudents.get(i).getID();
            var1.println(var2 + " " + listofstudents.get(i).getName() + " " + listofstudents.get(i).getAge());
        }

    }
}
