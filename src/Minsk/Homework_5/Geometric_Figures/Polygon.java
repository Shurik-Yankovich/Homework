package Minsk.Homework_5.Geometric_Figures;

public class Polygon extends Figure{

    private int countCorners;

    public Polygon(int countCorners) {
        this.countCorners = countCorners;
    }

    public int getCountCorners() {
        return countCorners;
    }

    public void setCountCorners(int countCorners) {
        this.countCorners = countCorners;
    }

    @Override
    public void printName() {
        System.out.println("Это многоугольник!");
    }
}
