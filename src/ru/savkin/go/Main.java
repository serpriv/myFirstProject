package ru.savkin.go;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {54, 67, 5, 89, 3, 42, 56, 78, 89, 5, 11};
        /*
        * 54
        *    2
        *     54 % 2 == 0? Da  -> break
        *
        * 67
        *    2
        *       67 % 2 == 0? Net sout
        *    3
        *      67 % 3 == 0? Net sout
        *    4
        *     67 % 4 == 0? Net sout
        *     ......
        *    66
        *     67 % 66 == 0? Net sout
        *
        * 5
        *   5 % 2 == 0? Net sout
        *   5 % 3 == 0? Net sout
        *
        *
        * */


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 2; j < numbers[i] - 1; j++) {
                if (numbers[i] % j == 0) {
                    break;
                } else {
                    System.out.println(numbers[i]);
                    break;
                }
            }

        }
    }
}
