package Minsk.Homework_9.storages;

import Minsk.Homework_9.trucks.Truck;

public class StorageForUnloading {

    private String name;

    public StorageForUnloading(int numberStorage) {
        name = String.format("склад для разгрузки товара №%d", numberStorage);
    }

    void unloadTruck(Truck truck) throws InterruptedException {
        System.out.println("Разгружается " + truck.getName());
        Thread.sleep(1000 * truck.getCarryingCapacity());
        System.out.println(truck.getName() + " разгружен");
    }
}
