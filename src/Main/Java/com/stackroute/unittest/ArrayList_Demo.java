//Write a Java program to update specific array element by given element and empty the array list.
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//        Array list after removing all elements []
package com.stackroute.unittest;

import java.util.ArrayList;

public class ArrayList_Demo {
    ArrayList<String> fruits = new ArrayList<>();

    public String listOfFruits(String str[], String val1, String val2){
       //adding element to fruit arraylist
        for(String s: str){
            fruits.add(s);
        }

        //replacing Apple with Kiwi and Melon with Mango
        fruits.set(0,val1);
        fruits.set(2,val2);

        return fruits.toString();
    }

    public String removeListOfFruits(String str[],String val1, String val2){
        //String val1,val2;
        listOfFruits(str,val1,val2);

        //Removing all array element
        fruits.clear();

        return fruits.toString();
    }
}
