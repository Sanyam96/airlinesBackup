package com.nagarro.service;

import com.nagarro.dao.FlightDao;
import com.nagarro.interfaces.FlightService;
import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.List;

/**
 * @author Sanyam Goel created on 11/9/18
 */
@Service
@Transactional
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightDao flightDao;

    @Transactional
    public List<Flight> getAllFlights() {
        return flightDao.getFlights();
    }

    @Transactional
    public List<Flight> getSearchedResults() {
        // main logic
        return flightDao.getSearchedResultFlights();
    }

    @Transactional
    public List<Flight> findMatchedFlight(FlightSearchDetails flightSearchDetails) throws ParseException {
        return flightDao.findMatchedFlight(flightSearchDetails);
    }
}
