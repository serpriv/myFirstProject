package homeworklesson9;

public class Maintriangle {
    public static void main(String[] args) {

        Triangle treug = new Triangle(5, 5, 5);

        treug.setStorona1(4.5);
        treug.setStorona2(7);
        treug.setStorona3(6);

        System.out.println("Сторона1 = " + treug.getStorona1());
        System.out.println("Сторона2 = " + treug.getStorona2());
        System.out.println("Сторона3 = " + treug.getStorona3());
        System.out.println("Периметр треугольника = " + treug.getPerimetr());
        System.out.println("Площадь треугольника = " + treug.getArea());
    }

}
