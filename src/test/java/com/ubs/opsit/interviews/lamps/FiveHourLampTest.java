package com.ubs.opsit.interviews.lamps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kemal on 12/24/2015.
 */
public class FiveHourLampTest {
    FiveHourLamp fiveHourLampTest;

    @Before
    public void setUp() throws Exception {
        fiveHourLampTest=new FiveHourLamp();
    }

    @After
    public void tearDown() throws Exception {
        fiveHourLampTest=null;
    }

    @Test
    public void testGetConvertedTime() throws Exception {
        String aTime="12:09:28";
        assertEquals("RROO",fiveHourLampTest.getConvertedTime(aTime));
    }

    @Test
    public void testgetHoursOf() throws Exception {
        String aTime="12:09:28";
        assertEquals(12,fiveHourLampTest.getHoursOf(aTime));
    }
}