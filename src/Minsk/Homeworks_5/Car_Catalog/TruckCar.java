package Minsk.Homeworks_5.Car_Catalog;

public class TruckCar extends Car {

    private int maxWeight;
    private double maxVolume;

    public TruckCar(int year, String name, int maxWeight, double maxVolume) {
        super(year, name);
        this.maxWeight = maxWeight;
        this.maxVolume = maxVolume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(double maxVolume) {
        this.maxVolume = maxVolume;
    }

}
