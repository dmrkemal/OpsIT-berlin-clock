package com.ubs.opsit.interviews.lamps;

/**
 * Created by kemal on 12/24/2015.
 */
public class FiveMinuteLamp extends Lamp {
    /* Indicates 3rd row of the Berlin Clock. Lamps are set as OFF at the beginning. */
    private StringBuilder fiveMinuteLamps=new StringBuilder("OOOOOOOOOOO");

    /**
     * Functionality to convert each 5 minutes as 5Minute Lamp format.
     *  For each 5minutes, 1 lamp will be set as R and for each quarter lamp will be set as Y.
     *
     * @param aTime [HH:mm:ss]
     * @return String converted lamp format.
     */
    @Override
    public String getConvertedTime(String aTime) {
        for(int i=0;i<(getMinutesOf(aTime)/MINUTE_DIVISOR);i++){
            if((i+1)%QUARTER_DIVISOR==ZERO)
                fiveMinuteLamps.replace(i, i+1, LAMP_RED);
            else
                fiveMinuteLamps.replace(i, i+1, LAMP_YELLOW);
        }
        return fiveMinuteLamps.toString();
    }
}
