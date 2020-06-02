package Minsk.Homeworks_5.Geometric_Figures;

public class Square extends Rectangle {

    public Square(double length) {
        super(length, length);
    }

    @Override
    public void printName() {
        System.out.println("Это квадрат!");
    }
}
