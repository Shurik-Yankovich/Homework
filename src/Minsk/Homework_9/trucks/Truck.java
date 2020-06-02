package Minsk.Homework_9.trucks;

import java.util.concurrent.Semaphore;

public class Truck extends Thread {

    private static final int TIME_FOR_LOADING_ONE_UNIT_OF_GOODS = 2000;
    private static final int TIME_FOR_UNLOADING_ONE_UNIT_OF_GOODS = 1000;
    private static final int TRAVEL_TIME_BETWEEN_STORAGES = 5000;

    private final int carryingCapacity;
    private final String name;
    private Semaphore storageForLoading;
    private Semaphore storageForUnloading;

    public Truck(int carryingCapacity, String name, Semaphore storageForLoading, Semaphore storageForUnloading) {
        this.carryingCapacity = carryingCapacity;
        this.name = name;
        this.storageForLoading = storageForLoading;
        this.storageForUnloading = storageForUnloading;
    }

    @Override
    public void run() {
        try {
            storageForLoading.acquire();
            loadTruck();
            storageForLoading.release();

            driveToTheStorage();

            storageForUnloading.acquire();
            unloadTruck();
            storageForUnloading.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void driveToTheStorage() throws InterruptedException {
        System.out.println(String.format("%s поехал на разгрузочные склады", name));
        Thread.sleep(TRAVEL_TIME_BETWEEN_STORAGES);
        System.out.println(String.format("%s приехал на разгрузку", name));
    }

    private void loadTruck() throws InterruptedException {
        System.out.println("Загружается " + name);
        Thread.sleep(TIME_FOR_LOADING_ONE_UNIT_OF_GOODS * carryingCapacity);
        System.out.println(name + " загружен");
    }

    private void unloadTruck() throws InterruptedException {
        System.out.println("Разгружается " + name);
        Thread.sleep(TIME_FOR_UNLOADING_ONE_UNIT_OF_GOODS * carryingCapacity);
        System.out.println(name + " разгружен");
    }

}
