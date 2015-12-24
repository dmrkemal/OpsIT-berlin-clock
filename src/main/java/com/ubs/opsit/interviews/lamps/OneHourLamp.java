package com.ubs.opsit.interviews.lamps;

/**
 * Created by kemal on 12/24/2015.
 */
public class OneHourLamp extends Lamp {
    /* Indicates 2nd row of the Berlin Clock. Lamps are set as OFF at the beginning. */
    private StringBuilder oneHourLamps=new StringBuilder("OOOO");

    /**
     * Functionality to convert the rest of the hours which is smaller than 5hours as 1Hour Lamp format.
     *  For each hour, 1 lamp will be set as R.
     *
     * @param aTime [HH:mm:ss]
     * @return String converted lamp format.
     */
    @Override
    public String getConvertedTime(String aTime) {
        for(int i=0;i<(getHoursOf(aTime)%HOUR_DIVISOR);i++){
            oneHourLamps.replace(i, i+1, LAMP_RED);
        }
        return oneHourLamps.toString();
    }
}
