package test;

public class Zadachi {
    public static boolean checkSumTwoChiselOt10do20vkl(int chislo1, int chislo2) {
        int sum = chislo1 + chislo2;
        return sum >= 10 && sum <= 20 ? true : false;
    }

//        if (sum >= 10 && sum <= 20) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

    public static void checkPlusOrMinus(int chislo) {
        if (chislo >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
//Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
// пределах от 10 до 20 (включительно),если да - вернуть true, в противном случае - false.


//Написать метод, которому в качестве параметра передается целое число,
//метод должен напечатать в консоль положительное ли число передали, или отрицательное.
//Замечание: ноль считаем положительным числом.