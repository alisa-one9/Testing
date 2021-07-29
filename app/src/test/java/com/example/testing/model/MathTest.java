package com.example.testing.model;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathTest {

    private Math math;

    @Before
    public void setUp() {
        math = new Math();

    }

    @Test
    public void testAdd() {
        assertEquals(4, math.add(1, 3));

    }

    @Test
    public void multiply() {
        assertEquals(10, math.multiply(5, 2));

    }

    @Test
    public void div() {
        assertEquals(20, math.div(40, 2));
        assertEquals(0, math.div(40, 0));
    }

    @Test
    public void subtraction() {
        assertEquals(15, math.subtract(20, 5));
    }

    @Test
    public void revert() {
        //assertEquals("bishkek hello", math.revert("hello bishkek"));
        //assertEquals("bishkek   hello",math.revert("hello   bishkek"));
        //assertEquals("Codify and Bishkek Bishkek",math.revert("Bishkek Bishkek and Codify"));
        //assertEquals("bishkek", math.revert("bishkek"));
        //assertEquals("",math.revert(""));
    }

    @After
    public void tearDown() {
        math = null;
    }

}