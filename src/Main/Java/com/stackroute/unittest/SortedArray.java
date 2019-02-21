//Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list
//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive
package com.stackroute.unittest;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortedArray {

    public ArrayList<String> SetArray(List<String> List){
        //checking if List is null
        if(List == null){
            return null;
        }

        // Using Tree set to sort

        TreeSet<String> map = new TreeSet<>(List);
        //Converting treeset into arraylist

        ArrayList<String> arrayList = new ArrayList<>(map);

        return arrayList;
    }
}
