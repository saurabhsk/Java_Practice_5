package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateStringTest {
    DuplicateString duplicateString;

    @Before
    public void setUp() throws Exception {
        duplicateString  = new DuplicateString();
    }

    @After
    public void tearDown() throws Exception {
        duplicateString = null;
    }

    @Test
    public void duplicateOf() {

        String expected = "{a=true, b=false, c=true, d=false}";
        String actual = duplicateString.duplicateOf("a,b,c,d,a,c,c");
        assertEquals(expected,actual);
    }
    @Test
    public void duplicateOff() {

        String expected = "{a=true, b=false, c=true, d=true}";
        String actual = duplicateString.duplicateOf("d,b,c,d,a,c,c");
        assertEquals(expected,actual);
    }
    @Test
    public void isduplicateOf() {
        String actual = duplicateString.duplicateOf(null);
        assertNull(actual);
    }
}