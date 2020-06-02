package Minsk.Homeworks_5.Geometric_Figures;

public class Parallelepiped extends Figure {

    private double corner;
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double corner, double length, double width, double height) {
        this.corner = corner;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getCorner() {
        return corner;
    }

    public void setCorner(double corner) {
        this.corner = corner;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void printName() {
        System.out.println("Это параллелепипед!");
    }
}
