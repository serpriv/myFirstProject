package lesson11;

public class Monkey extends ZooAnimal {

    public Monkey() {
        super(); // супер необязательно, он автоматически скрыто устанавливается
    }

    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("Уаааааа");

    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Обезьяна со стоимостью " + this.getCost());
    }
}
