package hwlesson5;

public class Hwlesson52v2 {
    public static void main(String[] args) {
        String text = "Hello, world!";
        String text2 = "Hallo Welt.";

       // String povtory = "";

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text.charAt(i) == text2.charAt(j) && text.charAt(i) != ' ') {
                    System.out.println(text.charAt(i));
                    break;
                }
            }
        }

    }
}

/**
 * Не соображу как сделать вывод без повторнения символов, разберем на занятии?)
 */
