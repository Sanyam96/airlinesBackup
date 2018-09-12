package com.nagarro.models;

/**
 * @author Sanyam Goel created on 12/9/18
 */
public class FlightSearchDetails {

    private String depInput;
    private String arrInput;
    private String flightDate;
    private String flightClass;
    private String sortPreference;

    public String getDepInput() {
        return depInput;
    }

    public void setDepInput(String depInput) {
        this.depInput = depInput;
    }

    public String getArrInput() {
        return arrInput;
    }

    public void setArrInput(String arrInput) {
        this.arrInput = arrInput;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getSortPreference() {
        return sortPreference;
    }

    public void setSortPreference(String sortPreference) {
        this.sortPreference = sortPreference;
    }
}