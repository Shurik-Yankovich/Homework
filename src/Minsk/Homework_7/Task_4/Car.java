package Minsk.Homework_7.Task_4;

public class Car {

    private int year;
    private String name;

    public Car(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void aboutCar(){
        System.out.println(name + " " + year + " года.");
    }
}
