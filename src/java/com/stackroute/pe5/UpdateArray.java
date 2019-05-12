//Write a Java program to update specific array element by given element and empty the array list.
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]
//Array list after removing all elements []
//
//2. Write a program to find the number of counts in the following String. Write a Java program to update specific array element by given element and empty the array list.
//Input: [Apple, Grape, Melon, Berry]
//Output: [Kiwi, Grape, Mango, Berry]
//Array list after removing all elements []
package com.stackroute.pe5;

import java.util.ArrayList;

public class UpdateArray {
    public static void main(String[] args) {
        //creating arraylist
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("grape");
        fruit.add("melon");
        fruit.add("berry");
        System.out.println("fruit list is " + fruit);
        //updating arrayList
        fruit.set(0, "kiwi");
        fruit.set(2, "mango");

        System.out.println("fruit list is " + fruit);

        fruit.removeAll(fruit);

        System.out.println("fruit list is " + fruit);
    }
}
