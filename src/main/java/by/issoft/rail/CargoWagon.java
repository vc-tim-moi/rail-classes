package by.issoft.rail;

import java.util.ArrayList;
import java.util.Collection;

public class CargoWagon extends Railcar {
    final int weightLimit;
    Collection<Cargo> cargo = new ArrayList<>();

    public CargoWagon(int weightLimit) {
        if (weightLimit < 1) {
            throw new IllegalArgumentException("Weight limit must be positive");
        }
        this.weightLimit = weightLimit;
    }

    public void addCargo(Cargo item) {
        if (cargo.stream().mapToInt(c -> c.weight).sum() + item.weight > weightLimit) {
            throw new IllegalStateException("Cannot add cargo above weight limit");
        }
        cargo.add(item);
    }
}