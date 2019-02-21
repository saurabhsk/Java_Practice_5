package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SortedArrayTest {
    SortedArray sortedArray;

    @Before
    public void setUp() throws Exception {
        sortedArray = new SortedArray();
    }

    @After
    public void tearDown() throws Exception {
        sortedArray = null;
    }

    @Test
    public void setArray() {
        List<String> List = new ArrayList<>();
        List.add("Harry");
        List.add("Olive");
        List.add("Alice");
        List.add("Bluto");
        List.add("Eugene");
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");
        actual = sortedArray.SetArray(List);
        assertEquals(expected.toString(),actual.toString());



    }
    @Test
    public void setArraynull(){
        ArrayList<String> actual = new ArrayList<>();
        actual=sortedArray.SetArray(null);
        assertNull(actual);
    }
}