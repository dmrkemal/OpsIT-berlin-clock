package com.ubs.opsit.interviews.lamps;

/**
 * Created by kemal on 12/24/2015.
 *
 * Abstract/Base class of Lamp classes.
 */
public abstract class Lamp {
    /* Indicates that the lamp is OFF. */
    protected static final String LAMP_OFF="O";
    /* Indicates that the lamp is Red. */
    protected static final String LAMP_RED="R";
    /* Indicates that the lamp is Yellow. */
    protected static final String LAMP_YELLOW="Y";
    /* Hour divisor. */
    protected static final int HOUR_DIVISOR=5;
    /* Minute divisor. */
    protected static final int MINUTE_DIVISOR=5;
    /* Second divisor. */
    protected static final int SECOND_DIVISOR=2;
    /* Quarter divisor. */
    protected static final int QUARTER_DIVISOR=3;
    /* Number Zero. */
    protected static final int ZERO=0;
    /*Regex pattern to split input time as hour,minute and second.*/
    private static final String REGEX_COLON = ":";

    public abstract String getConvertedTime(String aTime);

    /**
     * Functionality to retrieve seconds part of the input time.
     *
     * @param aTime [HH:mm:ss]
     * @return int seconds of the time.
     */
    protected int getSecondsOf(String aTime){
        return Integer.parseInt(aTime.split(REGEX_COLON)[2]);
    }

    /**
     * Functionality to retrieve minutes part of the input time.
     *
     * @param aTime [HH:mm:ss]
     * @return int minutes of the time.
     */
    protected int getMinutesOf(String aTime){
        return Integer.parseInt(aTime.split(REGEX_COLON)[1]);
    }

    /**
     * Functionality to retrieve hours part of the input time.
     *
     * @param aTime [HH:mm:ss]
     * @return int hours of the time.
     */
    protected int getHoursOf(String aTime){
        return Integer.parseInt(aTime.split(REGEX_COLON)[0]);
    }
}
