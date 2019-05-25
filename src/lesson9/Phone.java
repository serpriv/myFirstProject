package lesson9;

public class Phone {

    private double diagonal;  // поле класса. это переменные внутри класса, которые записывают состояние объекта.
    private String model;
    private int price;

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public String getModel() {
        return model;
    }

    public void setDiagonal(double diag) {
        diagonal = diag;

    }

    public double getDiagonal() {
        return diagonal;
    }

}
