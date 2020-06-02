package Minsk.Homework_9.trucks;

import java.util.concurrent.Semaphore;

public class SmallTruck extends Truck{

    private static final int CARRYING_CAPACITY_FOR_SMALL_TRUCK = 1;

    public SmallTruck(int numberTruck, Semaphore storageForLoading, Semaphore storageForUnloading) {
        super(CARRYING_CAPACITY_FOR_SMALL_TRUCK, String.format("Маленький грузовик №%d", numberTruck), storageForLoading, storageForUnloading);
    }

}
