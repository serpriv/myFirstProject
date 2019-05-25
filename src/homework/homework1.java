package homework;

public class homework1 {
    public static void main(String[] args) {
        int total = 1000;
        int costpizza = 230;
        int costgum = 26;
        double costcandy = 2.5;
        String text = "На эти деньги мы можем купить: ",
        text2 = "Сдача с магазина: ";
        int totalpizza = total/costpizza; // всего пицц
        int totalgum = (total-(totalpizza*costpizza))/costgum; // всего жевачек
        int change = (total-((totalpizza*costpizza)+(totalgum*costgum))); //сдача
        int totalcandy = (int) (change/costcandy);
        System.out.println(text);
        System.out.println("- " + totalpizza + " пиццы");
        System.out.println("- " + totalgum + " жвачки");
        System.out.println("- " + totalcandy + " конфет"); // получилось 0,8 конфеты...не понял как математически получить 0, учитывая разные типы данных
        System.out.println(text2 + change + " рубля");
    }
}
