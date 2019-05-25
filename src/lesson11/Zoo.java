package lesson11;

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
            System.out.println("Не хватает денег для покупки этого животного!");
            return; // остановка метода

        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
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
                animals[i].printInfo();

            }

        }


    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();

            }
        }
    }

    public void mostExpensiveAnimal() {
        ZooAnimal maxCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals[i].getCost()) {
                    maxCostAnimal = animals[i];

                }

            }
        }
        System.out.println("Самое дорогое животное ");
        maxCostAnimal.printInfo();
    }

    public void summaStoimostAllAnimals() {
        int summa = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                summa = summa + animals[i].getCost();
            }
        }

        System.out.println("Общая стоимость животных " + summa);
    }

}
/* null - пустое место */

// Полиморфизм - свойство Java, которое проявляется в моент выполнения программы. Java думает, что работает с
// одинаоквым типом данных, а на самом деле с разными.