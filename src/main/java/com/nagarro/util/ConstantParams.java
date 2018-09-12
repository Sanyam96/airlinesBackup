package com.nagarro.util;

/**
 * @author Sanyam Goel created on 12/9/18
 */
public class ConstantParams {

//    public final String flightsFilePath = "C:\\Users\\hansikasingh\\Desktop\\Training Course Plans\\Java Week 2 - Advance Java\\Assignment Links";
//    public final String fileSplitter = "\\|";
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
        if(constantParamsObject == null) {
            constantParamsObject = new ConstantParams();
        }
        return constantParamsObject;
    }
}
