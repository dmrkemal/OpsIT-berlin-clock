package com.ubs.opsit.interviews.lamps;

/**
 * Created by kemal on 12/24/2015.
 */
public class OneSecondLamp extends Lamp {

    /**
     * Functionality to convert each second as 1Second Lamp format.
     *  For each second, 1 lamp will be set as Y and next as O.
     *
     * @param aTime [HH:mm:ss]
     * @return String converted lamp format.
     */
    @Override
    public String getConvertedTime(String aTime) {
        if(getSecondsOf(aTime)%SECOND_DIVISOR==ZERO)
            return Lamp.LAMP_YELLOW;
        else
            return Lamp.LAMP_OFF;
    }
}
