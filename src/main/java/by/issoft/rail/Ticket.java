package by.issoft.rail;

public class Ticket {
    public final int seatNumber;
    public final PassengerWagon wagon;

    public Ticket(int seatNumber, PassengerWagon wagon) {
        if (seatNumber < 1 || seatNumber > wagon.capacity) {
            throw new IllegalArgumentException("Seat number must be positive and within wagon capacity");
        }
        this.seatNumber = seatNumber;
        this.wagon = wagon;
    }
}