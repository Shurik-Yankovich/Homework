package Minsk.Homework_9;

import Minsk.Homework_9.trucks.BigTruck;
import Minsk.Homework_9.trucks.MediumTruck;
import Minsk.Homework_9.trucks.SmallTruck;
import Minsk.Homework_9.trucks.Truck;

import java.util.concurrent.Semaphore;

public class TransportationOfGoods {

    private static final int NUMBER_OF_STORAGES_FOR_LOADING = 5;
    private static final int NUMBER_OF_STORAGES_FOR_UNLOADING = 2;
    private static final int NUMBER_OF_SMALL_TRUCK = 5;
    private static final int NUMBER_OF_MEDIUM_TRUCK = 10;
    private static final int NUMBER_OF_BIG_TRUCK = 5;
    private static final int NUMBER_OF_ALL_TRUCK = NUMBER_OF_SMALL_TRUCK + NUMBER_OF_MEDIUM_TRUCK + NUMBER_OF_BIG_TRUCK;

    public static void main(String[] args) {
        Semaphore storageForLoading = new Semaphore(NUMBER_OF_STORAGES_FOR_LOADING);
        Semaphore storageForUnloading = new Semaphore(NUMBER_OF_STORAGES_FOR_UNLOADING);
        Truck[] trucks = new Truck[NUMBER_OF_ALL_TRUCK];

        for (int i = 0; i < NUMBER_OF_ALL_TRUCK; i++) {
            if (i < NUMBER_OF_SMALL_TRUCK) {
                trucks[i] = new SmallTruck(i, storageForLoading, storageForUnloading);
            } else if (i < NUMBER_OF_SMALL_TRUCK + NUMBER_OF_MEDIUM_TRUCK) {
                trucks[i] = new MediumTruck(i, storageForLoading, storageForUnloading);
            } else {
                trucks[i] = new BigTruck(i, storageForLoading, storageForUnloading);
            }
        }

        for (int i = 0; i < NUMBER_OF_ALL_TRUCK; i++) {
            trucks[i].start();
        }
    }
}
