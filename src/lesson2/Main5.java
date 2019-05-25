package lesson2;

public class Main5 {
    public static void main(String[] args) {
        int mark = 3;

        if (mark == 2) {
            System.out.println("Плохо");

            if (mark == 3) {
                System.out.println("Не очень");

            } else if (mark == 4) {
                System.out.println("Хорошо");

            } else if (mark == 5) {
                System.out.println("Отлично");

            } else {
                System.out.println("Это не оценка");
            }
        }
    }
}
