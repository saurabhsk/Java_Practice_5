package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapModifyTest {
    MapModify mapModify;

    @Before
    public void setUp() throws Exception {
        mapModify = new MapModify();
    }

    @After
    public void tearDown() throws Exception {
        mapModify = null;
    }

    @Test
    public void modifiedArray() {
        Map<String ,String> map = new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String expected = "{val2=java, val1=}";
        String actual = mapModify.modifiedArray(map);
        assertEquals(expected,map.toString());
    }
    @Test
    public void modifiedArrayOf() {
        Map<String ,String> map = new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String expected = "{val2=java, val1=}";
        String actual = mapModify.modifiedArray(map);
        assertEquals(expected,map.toString());
    }
    @Test
    public void modifiedArraynull() {
        String actual = mapModify.modifiedArray(null);
        assertNull(actual);
    }
}