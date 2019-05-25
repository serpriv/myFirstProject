package lesson8;

public class Main2 {
    public static void main(String[] args) {
        String[][] tours = {{"Greece", "15000", "Polupansionat", "7 days"},
                {"Spain", "45000", "Hotel", "14 days"},
                {"France", "100000", "Hotel", "30 days"},
                {"France", "50000", "Appartments", "6 days"}};
        TourUtils.printToursByOneCountry(tours, "Spain");
        System.out.println();
        TourUtils.allAveragePrice(tours);
    }
}
