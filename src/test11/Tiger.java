package test11;

public class Tiger extends ZooAnimal {

    public Tiger() {
        super(); // обращение к родительскому классу ZooAnimal. super() - вызов родительского конструктора без параметоров.

    }

    public Tiger(int cost) {
        super(cost); // вызов конструктора родительского класса с одним входящим параметором "cost". F4.

    }


    public void voice() {
        System.out.println("Тигр рычит: РРРРРРР");
    }

    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Тигр со стоимостью = " + this.getCost());
    }
}
