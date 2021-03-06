package Minsk.Homework_7.Task_4;

public class PassengerCar extends Car {

    private int capacity;
    private int power;

    public PassengerCar(int year, String name, int capacity, int power) {
        super(year, name);
        this.capacity = capacity;
        this.power = power;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void aboutCar() {
        System.out.println("\"" + super.getName() + "\" " + super.getYear() + " года с вместимостью " + capacity + " человек и мощностью " + power + " л.с.");
    }
}
