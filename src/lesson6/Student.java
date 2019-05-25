package lesson6;

public class Student {

    // формула создания метода

    // 1 - модификатор доступа (public,private, protected, пустое место)

    // public - доступ по всему проекту
    // "пустое место" - доступ внутри текущей папки
    // protected - доступ только внутри текущего класса и его наследникам
    // private - доступ только внутри текущего класса

    // 2 - слово static есть, или нет

    // 3 - возвращаемый тип (int,String, char[]) или если нет возвращаемого типа - то void

    // 4 - название метода (придумываем в произвольной форме сами (с маленькой буквы))

    // 5 - входящие параметры в круглых скобках через запятую (тип и название переменной)

    // 6 -  в фигурных скобочках - тело метода. Т.е. то что будет выполняться, когда этот метод вызовут

    public static int summaTrexChisel(int a, int b, int c) {
        int summa = a + b + c;
        return summa;
    }


    public static int perimetrPraymougolnika(int a, int b) {
        int perimetr = (a * 2) + (b * 2);
        return perimetr;
    }

    public static void printHello(int chisloRaz) {
        for (int i = 0; i < chisloRaz; i++) {
            System.out.println("Привет");
        }
    }

    public static void chetORnechet(int chislo) {
        if (chislo % 2 == 0) {
            System.out.println("чет");
        } else {
            System.out.println("нечет");
        }
    }

}



