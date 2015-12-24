package com.ubs.opsit.interviews.lamps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kemal on 12/24/2015.
 */
public class FiveMinuteLampTest {
    FiveMinuteLamp fiveMinuteLampTest;

    @Before
    public void setUp() throws Exception {
        fiveMinuteLampTest=new FiveMinuteLamp();
    }

    @After
    public void tearDown() throws Exception {
        fiveMinuteLampTest=null;
    }

    @Test
    public void testGetConvertedTime() throws Exception {
        String aTime="12:09:28";
        assertEquals("YOOOOOOOOOO",fiveMinuteLampTest.getConvertedTime(aTime));
    }

    @Test
    public void testGetConvertedTimeisQuarter() throws Exception {
        String aTime="12:19:28";
        assertEquals("YYROOOOOOOO",fiveMinuteLampTest.getConvertedTime(aTime));
    }

    @Test
    public void testgetMinutesOf() throws Exception {
        String aTime="12:09:28";
        assertEquals(9,fiveMinuteLampTest.getMinutesOf(aTime));
    }
}