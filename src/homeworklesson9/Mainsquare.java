package homeworklesson9;

public class Mainsquare {
    public static void main(String[] args) {
        Square kvadrat = new Square(8);

        //kvadrat.setStoronaABCD(10);

        double area;
        area = kvadrat.getArea();

        System.out.println ("Стороны квадрата = " + kvadrat.getStoronaABCD() + " см");
        System.out.println("Периметр квадрата = " + kvadrat.getPerimetr() + " см");
        System.out.println("Площадь квадрата = " + area + " см2");

    }

}
