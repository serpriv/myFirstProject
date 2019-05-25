package test11;

public class Zoo {
    private int money;
    private ZooAnimal[] animals = new ZooAnimal[10];

    public Zoo() {

    }

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyAnimal(ZooAnimal animal) {
        if (money < animal.getCost()) {
            System.out.println("НЕ ДОСТАТОЧНО ДЕНЕГ ДЛЯ ПОКУПКИ ЖИВОТНОГО!!!");
            return; //(break останавливает цикл,return - метод) чтобы метод дальше не срабатывал/остновка метода.

        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {                    // null - пустое место.
                money = money - animal.getCost();
                animals[i] = animal;
                return;
            }
        }

        System.out.println("Нет свободных клеток");

    }

    public void printAnimal() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo(); // полиморфизм

            }

        }

    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice(); // принцип полиморфизма, проявляется в момент выполнения программы. JAVA думает,
                // что работает с одним типом данных, а на самом деле с разными.

            }
        }
    }

    public void mostExpensiveAnimal() {
        ZooAnimal maxCostAnimal = animals[0]; // указывая в методе mostExpensiveAnimals тип данных ZooAnimal мы можем использовать
        // в нём все методы (относитетльно переменной maxCostAnimal), которые указаны
        // в этом типе данных (ZooAnimal).
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals[i].getCost()) {
                    maxCostAnimal = animals[i];
                }
            }
        }
        System.out.println("Самое дорогое животное это ");
        maxCostAnimal.printInfo();
    }


    public void obshayaStoimostAllAnimals() {
        int summa = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                summa = summa + animals[i].getCost();
            }
        }
        System.out.println("Общая стоимость всех животных = " + summa);
    }


}
