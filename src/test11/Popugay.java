package test11;

public class Popugay extends ZooAnimal {


    public Popugay() {

    }

    public Popugay(int cost) {
        super(cost);
    }

    public void voice() {
        System.out.println("Попугай кричит: Кур-Кур");
    }

    public void jump() {
        System.out.println("Попугай прыгает");
    }

    public void printInfo() {
        System.out.println("Попугай со стомостью = " + this.getCost());
    }
}
