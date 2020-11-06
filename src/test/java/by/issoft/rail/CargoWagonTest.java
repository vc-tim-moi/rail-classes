package by.issoft.rail;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class CargoWagonTest {
    @Test
    public void validLoad() {
        CargoWagon c = new CargoWagon(20);
        assertDoesNotThrow(() -> {
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(5));
        });
    }

    @Test
    public void invalidLoad() {
        CargoWagon c = new CargoWagon(20);
        assertThrows(IllegalStateException.class,() -> {
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(5));
            c.addCargo(new Cargo(1));
        });
    }

    @Test
    public void validLimit() {
        assertDoesNotThrow(() -> new CargoWagon(1));
    }

    @Test
    public void invalidLimit() {
        assertThrows(IllegalArgumentException.class, () -> new CargoWagon(0));
    }
}
