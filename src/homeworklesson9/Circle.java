package homeworklesson9;

public class Circle {
    private double radius;
    private double area;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        area = Math.PI * (radius * radius);
        return area;
    }
}
