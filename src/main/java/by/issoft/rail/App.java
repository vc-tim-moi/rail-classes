package by.issoft.rail;

public class App 
{
    public static void main( String[] args )
    {
        PassengerWagon passengerWagon = new PassengerWagon(3);
        Passenger passenger = new Passenger(
            new Ticket(1, passengerWagon)
        );
        passengerWagon.addPassenger(passenger);

        Locomotive locomotive = new Locomotive();
        locomotive.attachRear(passengerWagon);

        CargoWagon cargoWagon = new CargoWagon(10);
        cargoWagon.addCargo(new Cargo(5));
        cargoWagon.addCargo(new Cargo(5));
        cargoWagon.attachFront(passengerWagon);
    }
}
