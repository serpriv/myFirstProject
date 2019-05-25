package homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя ");
        String inputname = scanner.nextLine();
        System.out.println("Привет, " + inputname);

        System.out.println("Хотите узнать площадь или периметр трапеции?");
        String action = scanner.next();

        if (action.equals("периметр")) {
            System.out.println("Введите длину первой стороны трапеции в сантиметрах: ");
            double storonaA = scanner.nextDouble();
            System.out.println("Введите длину второй стороны трапеции в сантиметрах: ");
            double storonaB = scanner.nextDouble();
            System.out.println("Введите длину третьей стороны трапеции в сантиметрах: ");
            double storonaC = scanner.nextDouble();
            System.out.println("Введите длину четвертой стороны трапеции в сантиметрах: ");
            double storonaD = scanner.nextDouble();
            System.out.println("Периметр трапеции = " + (storonaA + storonaB + storonaC + storonaD) + " см");
        } else if (action.equals("площадь")) {
            System.out.println("Введите длину первого основания трапеции в сантиметрах: ");
            double storonaA = scanner.nextDouble();
            System.out.println("Введите длину второго основания трапеции в сантиметрах: ");
            double storonaB = scanner.nextDouble();
            System.out.println("Введите высоту трапеции в сантиметрах: ");
            double storonaC = scanner.nextDouble();
            System.out.println("Площадь трапеции = " + (((storonaA + storonaB) / 2) * storonaC) + " см кв.");
        } else {
            System.out.println("!!!Некорректный ввод, необходим потворный запуск!!!");
        }
    }
}
