package lesson10.practice;

import java.util.Scanner;

public class Programma {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру: ");
        System.out.println("1 - Треугольник ");
        System.out.println("2 - Прямоугольник ");

        Scanner scanner = new Scanner(System.in);
        String inputFigura = scanner.nextLine();

        Figura figura = null;

        if (inputFigura.equals("1")) {
            Treugolnik treugolnik = new Treugolnik();
            System.out.println("Введите сторону А: ");
            String storonaA = scanner.nextLine();

            System.out.println("Введите сторону B: ");
            String storonaB = scanner.nextLine();

            System.out.println("Введите сторону C: ");
            String storonaC = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);
            int stC = Integer.parseInt(storonaC);

            figura = new Treugolnik(stA, stB, stC);

        }
        if (inputFigura.equals("2")) {
            Pramougolnic pramougolnic = new Pramougolnic();
            System.out.println("Введите сторону прямоугольника A: ");
            String storonaA = scanner.nextLine();

            System.out.println("Введите сторону прямоугольника B: ");
            String storonaB = scanner.nextLine();

            int stA = Integer.parseInt(storonaA);
            int stB = Integer.parseInt(storonaB);

            figura = new Pramougolnic(stA, stB);

        }

        System.out.println("Периметр или площадь? ");

        String inputAction = scanner.nextLine();
        if (inputAction.equalsIgnoreCase("Периметр")) {
            figura.printPerimetr();

        } else {
            figura.printPloshad();

        }


    }
}
