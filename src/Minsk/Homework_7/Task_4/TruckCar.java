package Minsk.Homework_7.Task_4;

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

    @Override
    public void aboutCar() {
        System.out.println("\"" + super.getName() + "\" " + super.getYear() + " года с вместимостью груза весом " + maxWeight + "кг и объемом " + maxVolume + " куб.м.");
    }
}
