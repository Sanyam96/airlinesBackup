package com.nagarro.dao;

import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;

import java.text.ParseException;
import java.util.List;

/**
 * Flight Data Access object layer
 * @author Sanyam Goel created on 11/9/18
 */
public interface FlightDao {

    public List<Flight> getFlights();

    public List<Flight> findMatchedFlight(FlightSearchDetails flightSearchDetails);
}
