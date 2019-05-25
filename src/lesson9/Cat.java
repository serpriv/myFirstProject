package lesson9;

public class Cat {
    private String poroda;
    private int age;
    private double dlinaHvosta;

    public Cat() {     // конструктор по умолчанию

    }

    public Cat(int newAge, String por, double dlinaH) {
        age = newAge;
        poroda = por;
        dlinaHvosta = dlinaH;

    }

    public void setPoroda(String newPoroda) {
        poroda = newPoroda;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setDlinaHvosta(double newDlinahvosta) {
        dlinaHvosta = newDlinahvosta;
    }

    public double getDlinaHvosta() {
        return dlinaHvosta;
    }
}
