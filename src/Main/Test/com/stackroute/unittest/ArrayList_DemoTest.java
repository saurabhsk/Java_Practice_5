package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayList_DemoTest {
    ArrayList_Demo arrayList_demo;

    @Before
    public void setUp() throws Exception {
        arrayList_demo = new ArrayList_Demo();
    }

    @After
    public void tearDown() throws Exception {
        arrayList_demo = null;
    }

    @Test
    public void listOfFruits() {
        String expected = "[Kiwi, Grape, Mango, Berry]";
        String actual = arrayList_demo.listOfFruits(new String[]{"Apple","Grape", "Melon", "Berry"},"Kiwi","Mango");
        assertEquals(expected,actual);
    }
    @Test
    public void RemovelistOfFruits() {
        String expected = "[]";
        String actual = arrayList_demo.removeListOfFruits(new String[]{"Apple","Grape", "Melon", "Berry"},"Kiwi","Mango");
        assertEquals(expected,actual);
    }
    @Test
    public void IslistOfFruits() {
        String expected = "[Grapes, Watermelon, Mausami, Lichi]";
        String actual = arrayList_demo.listOfFruits(new String[]{"Banana","Watermelon", "orange", "Lichi"},"Grapes","Mausami");
        assertEquals(expected,actual);
    }
    @Test
    public void IsremovelistOfFruits() {
        String expected = "[]";
        String actual = arrayList_demo.removeListOfFruits(new String[]{"Banana","Watermelon", "orange", "Lichi"},"Grapes","Mausami");
        assertEquals(expected,actual);
    }
}