//Write a program where an array of strings is input and output is a Map<String,boolean> where
//        each different string is a key and its value is true if that string appears 2 or more times in the array
//        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
package com.stackroute.unittest;

import java.util.*;

public class DuplicateString {

    public String  duplicateOf(String str){
        //checking if str is null
        if(str == null){
            return null;
        }
        Map<String,Integer > map = new HashMap<>();

        //storing in arraylist after spliting the str array

        List<String > arrayList = Arrays.asList(str.split(","));

        // checking if map contains key or not

        for(String s: arrayList){
            if(map.containsKey(s)){
                map.replace(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        //checking if map m contains values of key >=2

        Map<String ,Boolean> m = new HashMap<>();
        for(String each:map.keySet()){
            if(map.get(each)>=2){
                m.put(each,true);
            }
            else {
                m.put(each,false);
            }
        }
        return m.toString();
    }
}
