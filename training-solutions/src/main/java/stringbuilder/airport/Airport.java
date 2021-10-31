package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder("Törölt járatok:");
        for(Flight flight : flights){
            if(flight.getStatus()==Status.DELETED){
                sb.append("\n"+flight.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Airport airport = new Airport();
        airport.addFlight(new Flight("B-2351", Status.DELETED));
        airport.addFlight(new Flight("C-2351", Status.ACTIVE));
        airport.addFlight(new Flight("N-312561", Status.DELETED));
        airport.addFlight(new Flight("M-312561", Status.ACTIVE));
        airport.addFlight(new Flight("S-35", Status.DELETED));
        airport.addFlight(new Flight("S-36", Status.ACTIVE));
        System.out.println(airport.getDeletedFlights());
    }
}
