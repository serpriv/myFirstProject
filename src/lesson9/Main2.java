package lesson9;

public class Main2 {
    public static void main(String[] args) {
        Cat Leopold = new Cat();
        Cat Gav = new Cat();
        Cat Tom = new Cat();

        Leopold.setPoroda("Poroda1");
        Gav.setPoroda("Poroda2");
        Tom.setPoroda("Poroda3");
        Leopold.setAge(10);
        Gav.setAge(2);
        Tom.setAge(6);
        Leopold.setDlinaHvosta(13);
        Gav.setDlinaHvosta(13);
        Tom.setDlinaHvosta(13);

        Cat Leopold1 = new Cat(12,"Poroda1",15);
        Leopold1.setDlinaHvosta(17); // если вырос хвост,перезаписывает данные конструктора

        System.out.println(Leopold1.getAge());
        System.out.println(Leopold1.getDlinaHvosta());
        System.out.println(Leopold1.getPoroda());


    }
}
