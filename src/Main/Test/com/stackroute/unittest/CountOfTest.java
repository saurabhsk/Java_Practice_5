package com.stackroute.unittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOfTest {
    CountOf countOf;

    @Before
    public void setUp() throws Exception {
        countOf = new CountOf();
    }

    @After
    public void tearDown() throws Exception {
        countOf = null;
    }

    @Test
    public void wordCount() {
        String expected="{one=5, two=2, three=2}";
        String actual = countOf.wordCount("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }
    @Test
    public void wordCountnull() {
        String actual = countOf.wordCount(null);
        assertNull(actual);
    }
}