package ru.savkin.oop;

public class MainPersons {
    public static void main(String[] args) {
        Persons a = new Persons();
        Persons b = new Persons();

        a.name = "Alex";
        b.name = "John";

        a.age = 34;
        b.age = 44;

        a.printInformation();
        b.printInformation();
        a.age();
        b.age();

        Math m = new Math();
        System.out.println(m.min(3434,34344545));




    }
}
