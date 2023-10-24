package airlineApp;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineApp {

    private ArrayList<Flight> flights;
    private ArrayList<Passenger> passengers;


    public AirlineApp(){
        this.flights = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passenger) {
        this.passengers = passenger;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public static void main(String[] args) {
        int flightIds = 0;
        int passengerIds = 0;
        AirlineApp app = new AirlineApp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the booking system!");

        while (true){
            System.out.println("Choose an option from the menu below: ");
            System.out.println("1. Create a new flight");
            System.out.println("2. Display all available flights");
            System.out.println("3. Create a new passenger");
            System.out.println("4. Book a passenger onto a flight");
            System.out.println("5. Remove a passenger from a flight");
            System.out.println("6. Cancel a flight");
            System.out.println("7. Exit");

            System.out.println("Enter the number of the choice you want to pick");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Where do you want this flight to go to?");
                    String flightDestination = scanner.nextLine();
                    Flight flight = new Flight(flightDestination);
                    flightIds += 1;
                    flight.setFlightId(flightIds);
                    app.addFlight(flight);
                    break;
                case 2:
                    for (Flight f : app.getFlights()) {
                        System.out.println(f.getFlightId() + " " + f.getDestination());
                    }
                    break;
                case 3:
                    System.out.println("What is the Passenger's name?");
                    String passengerName = scanner.nextLine();
                    System.out.println("What is the Passenger's contact number?");
                    int passengerNumber = scanner.nextInt();
                    scanner.nextLine();
                    Passenger passenger = new Passenger(passengerName, passengerNumber);
                    app.addPassenger(passenger);
                    break;
                case 4:
                    System.out.println(app.getPassengers());
                    System.out.println("Which Passenger would you like to book a flight for?");
                    String passengerBooking = scanner.nextLine();
                    System.out.println("Which Flight would you like");
                    for (int i = 0; i < app.getPassengers().size(); i++) {
                        if (passengerBooking.equals(app.getPassengers().get(i).getName())) {

                        }
                    }
                    break;
                case 5:
                    break;
                default:
            }
        }
    }
}


