package com.ubs.opsit.interviews.lamps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kemal on 12/24/2015.
 */
public class OneSecondLampTest {
    OneSecondLamp oneSecondLampTest;

    @Before
    public void setUp() throws Exception {
        oneSecondLampTest=new OneSecondLamp();
    }

    @After
    public void tearDown() throws Exception {
        oneSecondLampTest=null;
    }

    @Test
    public void testGetConvertedTime() throws Exception {
        String aTime="12:09:28";
        assertEquals("Y",oneSecondLampTest.getConvertedTime(aTime));
    }

    @Test
    public void testgetSecondsOf() throws Exception {
        String aTime="12:09:28";
        assertEquals(28,oneSecondLampTest.getSecondsOf(aTime));
    }
}