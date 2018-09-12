package com.nagarro.util;

/**
 * Constants file to define all constants
 * @author Sanyam Goel created on 12/9/18
 */
public class ConstantParams {

    public final String datePattern = "dd-MM-yyyy";
    public static final String sortByFare = "Sort By Fare";
    public static final String sortByFareAndDuration = "Sort By Fare And Duration";
    public static final String economyFlightClass = "E";
    public static final String businessFlightClass = "B";

    private static ConstantParams constantParamsObject = null;

    private ConstantParams() {
        super();
    }

    public static final ConstantParams getObject() {
        if (constantParamsObject == null) {
            constantParamsObject = new ConstantParams();
        }
        return constantParamsObject;
    }
}
