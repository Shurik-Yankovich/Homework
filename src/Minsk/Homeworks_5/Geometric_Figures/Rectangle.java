package Minsk.Homeworks_5.Geometric_Figures;

public class Rectangle extends Parallelogram {

    double length;
    double width;

    public Rectangle(double length, double width) {
        super(90);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void printName() {
        System.out.println("Это прямоугольник!");
    }
}
