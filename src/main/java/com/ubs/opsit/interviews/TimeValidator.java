package com.ubs.opsit.interviews;

/**
 * Created by kemal on 12/24/2015.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeValidator{

    private Pattern pattern;
    private Matcher matcher;

    private static final String VALID_TIME_PATTERN ="([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
    private static final String EXCEPTIONAL_TIME="24:00:00";

    public TimeValidator(){
        pattern = Pattern.compile(VALID_TIME_PATTERN);
    }

    /**
     * Functionality to check if input time is in correct format.
     *
     * @param aTime
     * @return boolean true if input time is in correct format.
     */
    public boolean validateTime(String aTime){
        matcher = pattern.matcher(aTime);
        boolean retVal= matcher.matches();

        if(aTime.equals(EXCEPTIONAL_TIME))
            retVal=true;

        if(!retVal)
            throw new IllegalArgumentException(String.format("Input time [%s] is NOT in correct format!",aTime));

        return  retVal;
    }
}
