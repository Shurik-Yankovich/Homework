package Minsk.Homework_9.trucks;

public class BigTruck implements Truck {

    private final int carryingCapacity;
    private String name;

    public BigTruck(int numberTruck) {
        carryingCapacity = 5;
        name = String.format("Большой грузовик №%d", numberTruck);
    }

    @Override
    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String getName() {
        return name;
    }

}
