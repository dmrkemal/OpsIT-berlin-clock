package com.ubs.opsit.interviews.lamps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kemal on 12/24/2015.
 */
public class OneMinuteLampTest {
    OneMinuteLamp oneMinuteLampTest;

    @Before
    public void setUp() throws Exception {
        oneMinuteLampTest=new OneMinuteLamp();
    }

    @After
    public void tearDown() throws Exception {
        oneMinuteLampTest=null;
    }

    @Test
    public void testGetConvertedTime() throws Exception {
        String aTime="12:09:28";
        assertEquals("YYYY",oneMinuteLampTest.getConvertedTime(aTime));
    }

    @Test
    public void testgetMinutesOf() throws Exception {
        String aTime="12:09:28";
        assertEquals(9,oneMinuteLampTest.getMinutesOf(aTime));
    }
}