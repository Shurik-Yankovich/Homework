package Minsk.Homework_9.trucks;

public interface Truck {

    int getCarryingCapacity();
    String getName();
    default void driveToTheStorage(String storageName) throws InterruptedException{
        System.out.println(String.format("%s поехал на %s", getName(), storageName));
        Thread.sleep(5000);
    }

}
