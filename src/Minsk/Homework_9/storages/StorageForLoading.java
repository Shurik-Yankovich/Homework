package Minsk.Homework_9.storages;

import Minsk.Homework_9.trucks.Truck;

public class StorageForLoading {

    private String name;

    public StorageForLoading(int numberStorage) {
        name = String.format("склад для загрузки товара №%d", numberStorage);
    }

    void loadTruck(Truck truck) throws InterruptedException {
        System.out.println("Загружается " + truck.getName());
        Thread.sleep(2000 * truck.getCarryingCapacity());
        System.out.println(truck.getName() + " загружен");
    }
}
