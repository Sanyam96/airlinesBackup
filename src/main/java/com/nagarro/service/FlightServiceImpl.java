package com.nagarro.service;

import com.nagarro.dao.FlightDao;
import com.nagarro.enums.FlightOutputType;
import com.nagarro.interfaces.FlightService;
import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.util.Comparator;
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
        List<Flight> flights = flightDao.findMatchedFlight(flightSearchDetails);

        FlightOutputType flightOutputType = null;
        String preference = flightSearchDetails.getSortPreference().toUpperCase();
        flightOutputType = preference.contains("FARE") ? FlightOutputType.BY_FARE : FlightOutputType.BY_FARE_DURATION;
        switch (flightOutputType) {
            case BY_FARE:
                flights.sort(Comparator.comparing(Flight::getFlightFare));
                break;
            case BY_FARE_DURATION:
                flights.sort(Comparator.comparing(Flight::getFlightFare).thenComparing(Flight::getFlightDuration));
                break;
            default:
                break;
        }
        return flights;
    }
}
