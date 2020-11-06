package by.issoft.rail;

import java.util.HashMap;
import java.util.Map;

public class PassengerWagon extends Railcar {
    public final int capacity;
    Map<Integer, Passenger> seats = new HashMap<>();

    public PassengerWagon(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.capacity = capacity;
    }

    public void addPassenger(Passenger passenger) {
        if (this != passenger.ticket.wagon) {
            throw new IllegalStateException("Ticket specifies a different wagon");
        }
        if (seats.containsKey(passenger.ticket.seatNumber)) {
            throw new IllegalStateException("Seat is already occupied");
        }
        seats.put(passenger.ticket.seatNumber, passenger);
    }
}