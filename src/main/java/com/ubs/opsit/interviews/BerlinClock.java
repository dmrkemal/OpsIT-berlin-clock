package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.lamps.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.IllegalFormatException;
import java.util.Locale;

/**
 * Created by kemal on 12/24/2015.
 */
public class BerlinClock implements TimeConverter {
    /* Line seperator */
    private static final String NEW_LINE=System.getProperty("line.separator");
    /* Pattern to validate time in 24 hours format */
    private static final String TIME24HOURS_PATTERN ="([01]?[0-9]|2[0-3]):[0-5][0-9]";

    /* Time validator */
    private TimeValidator timeValidator;
    /*Indicates the seconds of Berlin Clock [Top of the Clock]*/
    private OneSecondLamp oneSecondLamp;
    /*Indicates the five hours of Berlin Clock [1th row of the Clock]*/
    private FiveHourLamp fiveHourLamp;
    /*Indicates the one hours of Berlin Clock [2nd row of the Clock]*/
    private OneHourLamp oneHourLamp;
    /*Indicates the five minutes of Berlin Clock [3rd row of the Clock]*/
    private FiveMinuteLamp fiveMinuteLamp;
    /*Indicates the one minutes of Berlin Clock [4th row of the Clock]*/
    private OneMinuteLamp oneMinuteLamp;

    /*
     * C'tor
     */
    public BerlinClock(){
        // instantiation of each row of the Berlin Clock.
        this.oneSecondLamp=new OneSecondLamp();
        this.fiveHourLamp=new FiveHourLamp();
        this.oneHourLamp=new OneHourLamp();
        this.fiveMinuteLamp=new FiveMinuteLamp();
        this.oneMinuteLamp=new OneMinuteLamp();
        this.timeValidator=new TimeValidator();
    }

    /**
     * Functionality to convert input time to Berlin Clock time.
     *
     * @param aTime [HH:mm:ss]
     * @return String format of Berlin Clock time.
     */
    @Override
    public String convertTime(String aTime) {
        //checks if the input time is in correct format, if not throws exception.
        timeValidator.validateTime(aTime);

        //Building Berlin Clock.
        return new StringBuilder()
                .append(this.oneSecondLamp.getConvertedTime(aTime)).append(NEW_LINE)
                .append(this.fiveHourLamp.getConvertedTime(aTime)).append(NEW_LINE)
                .append(this.oneHourLamp.getConvertedTime(aTime)).append(NEW_LINE)
                .append(this.fiveMinuteLamp.getConvertedTime(aTime)).append(NEW_LINE)
                .append(this.oneMinuteLamp.getConvertedTime(aTime))
                .toString();

    }
}
