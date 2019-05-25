package lesson2;

public class Main1 {
    public static void main(String[] args) {
        int a = 1003;
        int b = 230;
        int c = 26;
        double d = 2.5;

        int sdacha = a % b;
        System.out.println(sdacha);

        b++;
        ++b;
        System.out.println(b);
        System.out.println(++b);
        System.out.println(b++);

        b += 5;
        System.out.println(b);
    }
}
