package Minsk.Homeworks_5.Geometric_Figures;

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
}
