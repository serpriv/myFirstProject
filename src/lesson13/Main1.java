package lesson13;

public class Main1 {
    public static void main(String[] args) {


        Table table1 = new Table(12, 4, 67);
        Table table2 = new Table(12, 4, 67);

       boolean resultEquals = table1.equals(table2);
        System.out.println(resultEquals);

    }

}
