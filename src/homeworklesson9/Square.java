package homeworklesson9;

public class Square {
    private double storonaABCD;
    private double perimetr;
    private double area;

    public Square() {

    }

    public Square(double storonaABCD) {
        this.storonaABCD = storonaABCD;
    }

    public void setStoronaABCD(double newStoronaABCD) {
        storonaABCD = newStoronaABCD;
    }

    public double getStoronaABCD() {
        return storonaABCD;
    }

    public double getPerimetr() {
        perimetr = storonaABCD * 4;
        return perimetr;
    }

    public double getArea() {
        area = storonaABCD * storonaABCD;
        return area;
    }
}
