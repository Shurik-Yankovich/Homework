package Minsk.Homework_9.trucks;

public class MediumTruck implements Truck {

    private final int carryingCapacity;
    private String name;

    public MediumTruck(int numberTruck) {
        carryingCapacity = 3;
        name = String.format("Средний грузовик №%d", numberTruck);
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
