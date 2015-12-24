package com.ubs.opsit.interviews.lamps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kemal on 12/24/2015.
 */
public class OneHourLampTest {
    OneHourLamp oneHourLampTest;

    @Before
    public void setUp() throws Exception {
        oneHourLampTest=new OneHourLamp();
    }

    @After
    public void tearDown() throws Exception {
        oneHourLampTest=null;
    }

    @Test
    public void testGetConvertedTime() throws Exception {
        String aTime="12:09:28";
        assertEquals("RROO",oneHourLampTest.getConvertedTime(aTime));
    }

    @Test
    public void testgetHoursOf() throws Exception {
        String aTime="12:09:28";
        assertEquals(12,oneHourLampTest.getHoursOf(aTime));
    }
}