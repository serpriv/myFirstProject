package lesson3;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя ");
        String inputname = scanner.nextLine();
        System.out.println("Привет, " + inputname);

        System.out.println("Введите первую сторону треугольника: ");
        double storonaA = scanner.nextDouble();
        System.out.println("Введите вторую сторону треугольника: ");
        double storonaB = scanner.nextDouble();
        System.out.println("Введите третью сторону треугольника: ");
        double storonaС = scanner.nextDouble();

        System.out.println("Площадь или периметр?");
        String action = scanner.next();

        if (action.equals("периметр")) {
            System.out.println("Периметр треугольника = " + (storonaA + storonaB + storonaС));
        }
        else if (action.equals("площадь")) {

            double poluperimetr = (storonaA + storonaB + storonaС) / 2; // полупериметр треугольника для расчета площади

            System.out.println("Площадь треугольника = " + (Math.sqrt((poluperimetr * (poluperimetr - storonaA) * (poluperimetr - storonaB) * (poluperimetr - storonaС)))));
        }
        else {
            System.out.println("Ввод некорректен,запустите программу заново");
        }
    }
}
