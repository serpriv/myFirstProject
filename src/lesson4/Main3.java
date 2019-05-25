package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String text = "qwertyihh";
        char[] simbolsFromtext = text.toCharArray();

        for (int i = 0; i < simbolsFromtext.length; i++) {
            char result = simbolsFromtext[i];
            System.out.println(result);
        }
    }
}
