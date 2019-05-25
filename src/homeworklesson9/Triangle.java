package homeworklesson9;

public class Triangle {
    private double storona1;
    private double storona2;
    private double storona3;
    private double perimetr;
    private double area;

    public Triangle() {

    }

    public Triangle(double newStorona1, double newStorona2, double newStorona3) {
        storona1 = newStorona1;
        storona2 = newStorona2;
        storona3 = newStorona3;
    }

    public void setStorona1(double newStorona1) {
        storona1 = newStorona1;
    }

    public double getStorona1() {
        return storona1;
    }

    public void setStorona2(double newStorona2) {
        storona2 = newStorona2;
    }

    public double getStorona2() {
        return storona2;
    }

    public void setStorona3(double newStorona3) {
        storona3 = newStorona3;
    }

    public double getStorona3() {
        return storona3;
    }

    public double getPerimetr() {
        perimetr = storona1 + storona2 + storona3;
        return perimetr;
    }

    public double getArea() {
        perimetr = storona1 + storona2 + storona3;
        double poluperimetr;
        poluperimetr = perimetr/2;
        area = (Math.sqrt((poluperimetr * (poluperimetr - storona1) * (poluperimetr - storona2) * (poluperimetr - storona3))));
        return area;
    }
}



