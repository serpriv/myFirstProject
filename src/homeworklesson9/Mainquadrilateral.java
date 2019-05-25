package homeworklesson9;

public class Mainquadrilateral {
    public static void main(String[] args) {
        Quadrilateral pryamougolnik = new Quadrilateral(6, 8);

        double a = pryamougolnik.getPerimetr();
        double b = pryamougolnik.getArea();

        System.out.println("Стороны АВ прямоугольника  = " + pryamougolnik.getStoronaAB()+ " см");
        System.out.println("Стороны CD прямоугольника  = " + pryamougolnik.getStoronaCD() + " см");
        System.out.println("Периметр прямоугольника = " + a + " см");
        System.out.println("Площадь прямоугольника = " + b + " см2");

    }
}
