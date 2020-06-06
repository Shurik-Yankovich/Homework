package Minsk.Homework_9.trucks;

import java.util.concurrent.Semaphore;

public class BigTruck extends Truck {

    private static final int CARRYING_CAPACITY_FOR_BIG_TRUCK = 5;

    public BigTruck(int numberTruck, Semaphore storageForLoading, Semaphore storageForUnloading) {
        super(CARRYING_CAPACITY_FOR_BIG_TRUCK, String.format("Большой грузовик №%d", numberTruck), storageForLoading, storageForUnloading);
    }

}
