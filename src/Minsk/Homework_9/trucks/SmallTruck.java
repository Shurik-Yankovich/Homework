package Minsk.Homework_9.trucks;

public class SmallTruck implements Truck {

    private final int carryingCapacity;
    private String name;

    public SmallTruck(int numberTruck) {
        carryingCapacity = 1;
        name = String.format("Маленький грузовик №%d", numberTruck);
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
