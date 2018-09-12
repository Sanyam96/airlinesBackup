package com.nagarro.interfaces;

import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;
import com.nagarro.models.User;

import java.text.ParseException;
import java.util.List;

/**
 * @author Sanyam Goel created on 11/9/18
 */
public interface FlightService {

    public List<Flight> getAllFlights();

    public List<Flight> getSearchedResults();

    public List<Flight> findMatchedFlight(FlightSearchDetails flightSearchDetails) throws ParseException;
}
