//Write a Java program to update specific array element by given element and empty the array list.
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//        Array list after removing all elements []
package com.stackroute.unittest;

import java.util.ArrayList;

public class ArrayList_Demo {
    ArrayList<String> fruits = new ArrayList<>();

    public String listOfFruits(String str[]){
       //adding element to fruit arraylist
        for(String s: str){
            fruits.add(s);
        }

        //replacing Apple with Kiwi and Melon with Mango
        fruits.set(0,"Kiwi");
        fruits.set(2,"Mango");

        return fruits.toString();
    }

    public String removeListOfFruits(String str[]){

        listOfFruits(str);

        //Removing all array element
        fruits.clear();

        return fruits.toString();
    }
}
