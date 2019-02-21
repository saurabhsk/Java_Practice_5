//Write a program to find the number of counts in the following String. Store the output in
//        Map<String,Integer> as key value pair.
//        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}

package com.stackroute.unittest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountOf {

    public String wordCount(String str){
        if(str == null){
            return null;
        }
        List<String> stringList = Arrays.asList(str.split("[\\W_]+"));
        Map<String,Integer> listmap = new HashMap<>();
        for(String s: stringList){
            if(listmap.containsKey(s)){
                listmap.replace(s,listmap.get(s)+1);
            }
            else{
                listmap.put(s,1);
            }
        }

        return listmap.toString();
    }
}
