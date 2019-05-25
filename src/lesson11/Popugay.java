package lesson11;

public class Popugay extends ZooAnimal {

    public Popugay() {
    }

    public Popugay(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("IIAaaaaaa");

    }

    @Override
    public void jump() {

        System.out.println("Попугай прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Попугай со стоимостью " + this.getCost());
    }
}
