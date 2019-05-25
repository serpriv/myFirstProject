package test11;

public class Monkey extends ZooAnimal {


    public Monkey() {
    }

    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("Обезьяна кричит: Уауауауауа");

    }

    public void jump() {
        System.out.println("Обезьяна прыгает");
    }

    public void printInfo() {
        System.out.println("Обезьяна со стоимостью = " + this.getCost());
    }
}
