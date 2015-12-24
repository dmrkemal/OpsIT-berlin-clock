package com.ubs.opsit.interviews;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kemal on 12/24/2015.
 */
public class TimeValidatorTest {
    TimeValidator timeValidatorTest;

    @Before
    public void setUp() throws Exception {
        timeValidatorTest=new TimeValidator();
    }

    @After
    public void tearDown() throws Exception {
        timeValidatorTest=null;
    }

    @Test
    public void testTimeIsValid() throws Exception {
        String aTime="23:09:28";
        assertTrue(timeValidatorTest.validateTime(aTime));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeIsInvalid1() throws Exception {
        String aTime="24:00:01";
        timeValidatorTest.validateTime(aTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeIsInvalid2() throws Exception {
        String aTime="11:43";
        timeValidatorTest.validateTime(aTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeIsInvalid3() throws Exception {
        String aTime="10;28";
        timeValidatorTest.validateTime(aTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeIsInvalid4() throws Exception {
        String aTime="12:68:76";
        timeValidatorTest.validateTime(aTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeIsInvalid5() throws Exception {
        String aTime="invalid time";
        timeValidatorTest.validateTime(aTime);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTimeIsInvalid6() throws Exception {
        String aTime="-11:34:58";
        timeValidatorTest.validateTime(aTime);
    }
}