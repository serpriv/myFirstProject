package lesson9;

// ООП
public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();
        Phone saomi = new Phone();

        meizu.setModel("Model1");
        saomi.setModel("Model2");
        System.out.println(saomi.getModel());

//        meizu.setPrice(10000);
//        saomi.setPrice(8000);
//        System.out.println(meizu.getPrice());
//        System.out.println(saomi.getPrice());
//
//
//        meizu.setModel("Meizu");
//        saomi.setModel("Saomi");
//        System.out.println(meizu.getModel());
//        System.out.println(saomi.getModel());
//
//        saomi.setDiagonal(6.7);
//        meizu.setDiagonal(7.3);
//
//        System.out.println(meizu.getDiagonal());
//        System.out.println(saomi.getDiagonal());
    }

}
