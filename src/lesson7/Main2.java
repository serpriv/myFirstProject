package lesson7;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Начался отчет времени ");
        for (int year = 0; year < 5000; year++) {
            for (int day = 0; day < 366; day++) {
                for (int hour = 0; hour < 24; hour++) {
                    for (int min = 0; min < 60; min++) {
                        for (int sec = 0; sec < 60; sec++) {
                            System.out.printf("От старта прошло %d года,%d дней, %d часа,%d минут, %d секунд",year,day,hour,min,sec);
                            System.out.println();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }
                }
            }
        }
    }
}