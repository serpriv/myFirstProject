package lesson10;

// наследование (является)
// public void printToConsole() - сигнатура, если повторяется в других классах,
// то это называется переопредлением метода.


public class Dog extends Animal  {
    public void printToConsole() {
        System.out.println("Собака с возрастом " + this.getAge());
    }
}
