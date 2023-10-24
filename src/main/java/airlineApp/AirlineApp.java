package airlineApp;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineApp {

    private ArrayList<Flight> flights;
    public AirlineApp(){
        this.flights = new ArrayList<>();
    }
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the booking system!");
            System.out.println("Choose an option from the menu below: ");
            System.out.println("1. Create a new flight");
            System.out.println("2. Display all available flights");
            System.out.println("3. Create a new passenger");
            System.out.println("4. Book a passenger onto a flight");
            System.out.println("5. Remove a passenger from a flight");
            System.out.println("6. Cancel a flight");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                  public void createNewFlight(){
                    System.out.println("Where do you want this flight to go to?");
                    String flightDestination = scanner.nextLine();
                    Flight flight = new Flight(flightDestination);
                }
                    break;
                case 2:
                    // Perform "encrypt number" case.
                    break;
                case 3:
                    // Perform "decrypt number" case.
                    break;
                case 4:
                    // Perform "quit" case.
                    break;
                default:
                    // The user input an unexpected choice.
            }

        }


    }
}


