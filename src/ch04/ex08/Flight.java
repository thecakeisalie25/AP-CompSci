package ch04.ex08;

/**
 * Flight
 * @author Larson Ashcroft
 * @see FlightTest.java
 */
public class Flight {

    private int flightnum;
    private String destination, origin, airline;

    public Flight(int flightnum, String destination, String origin, String airline) {
        setFlightnum(flightnum);
        setDestination(destination);
        setOrigin(origin);
        setAirline(airline);
    }

    public String toString() {
        return "Flight " + flightnum + " from " + origin + " to " + destination + " via " + airline+".";
    }

    /**
     * @return the flightnum
     */
    public int getFlightnum() {
        return flightnum;
    }

    /**
     * @return the airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * @param airline the airline to set
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @param flightnum the flightnum to set
     */
    public void setFlightnum(int flightnum) {
        this.flightnum = flightnum;
    }
    
}