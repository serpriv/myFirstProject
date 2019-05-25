package lesson2;

public class Main4 {
    public static void main(String[] args) {
        int a = 5, b = 5, c = 4;

        if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");

        }

        if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");

        }
        if ((a == b && b != c)  || ( c == a && c != b ) || ( b == c  && c !=a ))
    {
            System.out.println("Это равнобедренный треугольник");
        }


    }
}
