package lesson9;

public class Main3 {
    public static void main(String[] args) {
        Person person = new Person(12, "Сергей", "Привалов", 19281);
        Person person2 = new Person ("Лионель", "Месси");

        person2.setSername("Титов");
        System.out.println(person2.getSername());
        System.out.println(person.getAge());



    }


}
