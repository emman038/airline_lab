import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengersOnboard;


    public Flight() {
        this.passengersOnboard = new ArrayList<Passenger>();
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


