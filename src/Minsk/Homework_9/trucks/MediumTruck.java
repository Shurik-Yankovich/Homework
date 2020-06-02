package Minsk.Homework_9.trucks;

import java.util.concurrent.Semaphore;

public class MediumTruck extends Truck {

    private static final int CARRYING_CAPACITY_FOR_MEDIUM_TRUCK = 3;

    public MediumTruck(int numberTruck, Semaphore storageForLoading, Semaphore storageForUnloading) {
        super(CARRYING_CAPACITY_FOR_MEDIUM_TRUCK, String.format("Средний грузовик №%d", numberTruck), storageForLoading, storageForUnloading);
    }

}
