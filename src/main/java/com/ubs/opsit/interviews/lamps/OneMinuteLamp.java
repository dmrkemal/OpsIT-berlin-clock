package com.ubs.opsit.interviews.lamps;

/**
 * Created by kemal on 12/24/2015.
 */
public class OneMinuteLamp extends Lamp {
    /* Indicates 4th row of the Berlin Clock. Lamps are set as OFF at the beginning. */
    private StringBuilder oneMinuteLamps=new StringBuilder("OOOO");

    /**
     * Functionality to convert the rest of the minutes which is smaller than 5minutes as 1Minute Lamp format.
     *  For each minute, 1 lamp will be set as Y.
     *
     * @param aTime [HH:mm:ss]
     * @return String converted lamp format.
     */
    @Override
    public String getConvertedTime(String aTime) {
        for(int i=0;i<(getMinutesOf(aTime)%MINUTE_DIVISOR);i++){
            oneMinuteLamps.replace(i, i+1, LAMP_YELLOW);
        }
        return oneMinuteLamps.toString();
    }
}
