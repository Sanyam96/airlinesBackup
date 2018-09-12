package com.nagarro.repository;

import com.nagarro.dao.FlightDao;
import com.nagarro.models.Flight;
import com.nagarro.models.FlightSearchDetails;
import com.nagarro.util.ConstantParams;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Sanyam Goel created on 11/9/18
 */
@Repository
public class FlightDaoImpl implements FlightDao {

    @Autowired
    private SessionFactory sessionFactory;

    private static ConstantParams constParamsObj = ConstantParams.getObject();

    public List<Flight> getFlights() {
        return sessionFactory.getCurrentSession().createQuery("from Flight").list();
    }

    public List<Flight> getSearchedResultFlights(){
//        SimpleDateFormat sdf = new SimpleDateFormat(constParamsObj.datePattern);
//        Date flightDate = null;
//        List<Flight> flights = null;
//        try {
//            flightDate = sdf.parse(flightSearchData.getFlightDate());
//
//            Session session = sessionFactory.getCurrentSession();
//            String queryString = "from Flight flight where flight.depLocation = :departure and flight.arrLocation = :arrival and flight.validTill >= :flightDate and flight.flightClass like '%" + flightSearchData.getFlightClass() + "%' and flight.availability = 'Y'";
//
//            Query query = (Query) session.createQuery(queryString);
//            query.setParameter("departure", flightSearchData.getDepInput());
//            query.setParameter("arrival", flightSearchData.getArrInput());
//            query.setParameter("flightDate", flightDate);
//            flights = query.list();
//        } catch (ParseException e) {
//            System.err.println("Flight Repository: Parse exception while converting string to Date type.");
//            e.printStackTrace();
//        }
//
//        return flights;
        return null;
    }

    public List<Flight> findMatchedFlight(FlightSearchDetails flightSearchData) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat(constParamsObj.datePattern);
        Date flightDate = null;
        List<Flight> flights = null;
        try {
            flightDate = sdf.parse(flightSearchData.getFlightDate());

            Session session = sessionFactory.getCurrentSession();
            String queryString = "from Flight flight where flight.departureLocation = :departure and flight.arrivalLocation = :arrival and flight.validTillDate >= :flightDate and flight.flightClass like '%" + flightSearchData.getFlightClass() + "%' and flight.isFlightAvailable = 'Y'";

            Query query = (Query) session.createQuery(queryString);
            query.setParameter("departure", flightSearchData.getDepInput());
            query.setParameter("arrival", flightSearchData.getArrInput());
            query.setParameter("flightDate", flightDate);
            flights = query.list();
        } catch (ParseException e) {
            System.err.println("Flight Repository: Parse exception while converting string to Date type.");
            e.printStackTrace();
        }

        return flights;
    }
}
