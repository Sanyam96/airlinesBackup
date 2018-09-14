package com.nagarro.interfaces;

import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;

import java.text.ParseException;
import java.util.List;

/**
 * Flight service interfaces and functions
 * @author Sanyam Goel created on 11/9/18
 */
public interface FlightService {

    public List<Flight> getAllFlights();

    public List<Flight> findMatchedFlight(FlightSearchDetails flightSearchDetails);
}
