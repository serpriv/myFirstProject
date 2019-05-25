package ru.savkin.oop;

public class Math {//Возвращает максимум

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    //Возвращает минимум
    public int min(int a, int b) {
        return a < b ? a : b;
    }

    //Возращает модуль числа
    public int abs(int x) {
        return x > 0 ? x : -x;
    }

}
