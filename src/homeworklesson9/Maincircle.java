package homeworklesson9;

public class Maincircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);

        Circle circle2 = new Circle (6);

        System.out.println("Радиус круга = " + circle.getRadius());
        System.out.println("Площадь круга = " + circle.getArea());
        System.out.println();
        System.out.println("Радиус круга 2 = " + circle2.getRadius());
        System.out.println("Площадь круга 2 = " + circle2.getArea());
    }
}
