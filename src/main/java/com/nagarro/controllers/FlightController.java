package com.nagarro.controllers;

import com.nagarro.interfaces.FlightService;
import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.List;

/**
 * Flight Controller for managing and interaction with FlightControllers
 * @author Sanyam Goel created on 12/9/18
 */
@Controller
public class FlightController {

    @Autowired
    private FlightService flightService;

    /**
     * controller to retrieve all flight from the database
     * @param modelAndView
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/get-flights")
    public ModelAndView getAllFlights(ModelAndView modelAndView) {
        List<Flight> flights = flightService.getAllFlights();
        modelAndView.addObject("allFlights", flights);
        modelAndView.setViewName("flights");
        return modelAndView;
    }

    /**
     * Controller to search flights for input data
     * @param flightSearchData
     * @param modelAndView
     * @return
     */
    @RequestMapping(value = "/searchFlights", method = RequestMethod.POST)
    public ModelAndView searchFlights(@ModelAttribute("flightSearchData") FlightSearchDetails flightSearchData) throws ParseException {

        ModelAndView model = new ModelAndView();

        List<Flight> searchedFlights = flightService.findMatchedFlight(flightSearchData);
        if (!searchedFlights.isEmpty()) {
            model.addObject("flightSearchData", flightSearchData);
            model.addObject("searchedFlights", searchedFlights);
            model.setViewName("flightsResults");
        } else {
            model.setViewName("noSearchResults");
        }

        return model;
    }

}
