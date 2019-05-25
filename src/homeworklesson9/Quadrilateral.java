package homeworklesson9;

public class Quadrilateral {
    private double storonaAB;
    private double storonaCD;
    private double perimetr;
    private double area;

    public Quadrilateral() {

    }

    public Quadrilateral(double storonaAB, double storonaCD) {
        this.storonaAB = storonaAB;
        this.storonaCD = storonaCD;
    }

    public void setStoronaAB(double storonaAB) {
        this.storonaAB = storonaAB;
    }

    public double getStoronaAB() {
        return storonaAB;
    }

    public void setStoronaCD(double storonaCD) {
        this.storonaCD = storonaCD;
    }

    public double getStoronaCD() {
        return storonaCD;
    }

    public double getPerimetr() {
        perimetr = (storonaAB + storonaCD) * 2;
        return perimetr;
    }

    public double getArea() {
        area = storonaAB*storonaCD;
        return area;
    }
}
