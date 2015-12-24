package com.ubs.opsit.interviews.lamps;

/**
 * Created by kemal on 12/24/2015.
 */
public class FiveHourLamp extends Lamp {
    /* Indicates 1th row of the Berlin Clock. Lamps are set as OFF at the beginning. */
    private StringBuilder fiveHourLamps=new StringBuilder("OOOO");

    /**
     * Functionality to convert each 5 hours as 5Hour Lamp format.
     *  For each 5hours, 1 lamp will be set as R.
     *
     * @param aTime [HH:mm:ss]
     * @return String converted lamp format.
     */
    @Override
    public String getConvertedTime(String aTime) {
        for(int i=0;i<(getHoursOf(aTime)/HOUR_DIVISOR);i++){
            fiveHourLamps.replace(i, i+1, LAMP_RED);
        }
        return fiveHourLamps.toString();
    }
}
