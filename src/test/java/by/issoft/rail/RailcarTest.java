package by.issoft.rail;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class RailcarTest {
    @Test
    public void validAttach()
    {
        Railcar a = new Locomotive();
        Railcar b = new Locomotive();
        assertDoesNotThrow(()->a.attachRear(b));
    }

    @Test
    public void invalidAttach()
    {
        Railcar a = new Locomotive();
        assertThrows(IllegalArgumentException.class,()->a.attachRear(a));
    }
}
