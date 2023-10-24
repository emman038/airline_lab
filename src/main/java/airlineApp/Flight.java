package airlineApp;


import interfaces.IPassenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengersOnboard;
    private String destination;
    private int flightId;


    public Flight(String destination) {
        this.passengersOnboard = new ArrayList<Passenger>();
        this.destination = destination;
        this.flightId = 0;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passenger> getPassengersOnboard() {
        return passengersOnboard;
    }

    public void setPassengersOnboard(ArrayList<Passenger> passengersOnboard) {
        this.passengersOnboard = passengersOnboard;
    }

    public void modifyPassengersOnboard(Passenger passenger) {
        this.passengersOnboard.add(passenger);
    }
}


