package by.issoft.rail;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class PassengerWagonTest {
    @Test
    public void validCapacity() {
        assertDoesNotThrow(() -> new PassengerWagon(1));
    }

    @Test
    public void invalidCapacity() {
        assertThrows(IllegalArgumentException.class, () -> new PassengerWagon(0));
    }

    @Test
    public void validBoarding() {
        PassengerWagon w = new PassengerWagon(50);
        Passenger p1 = new Passenger(new Ticket(24, w));
        Passenger p2 = new Passenger(new Ticket(42, w));
        assertDoesNotThrow(() -> {
            w.addPassenger(p1);
            w.addPassenger(p2);
        });
    }

    @Test
    public void invalidBoarding() {
        PassengerWagon w = new PassengerWagon(50);
        Passenger p1 = new Passenger(new Ticket(42, w));
        Passenger p2 = new Passenger(new Ticket(42, w));
        assertThrows(IllegalStateException.class, () -> {
            w.addPassenger(p1);
            w.addPassenger(p2);
        });
    }
}
