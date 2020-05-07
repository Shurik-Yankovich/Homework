package Minsk.Homeworks_5.Geometric_Figures;

public class Parallelogram extends Polygon{

    private double corner;

    public Parallelogram(double corner) {
        super(4);
        this.corner = corner;
    }

    public double getCorner() {
        return corner;
    }

    public void setCorner(double corner) {
        this.corner = corner;
    }
}
