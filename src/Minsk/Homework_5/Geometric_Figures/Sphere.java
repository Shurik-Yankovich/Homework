package Minsk.Homework_5.Geometric_Figures;

public class Sphere extends Figure {

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void printName() {
        System.out.println("Это сфера!");
    }
}
