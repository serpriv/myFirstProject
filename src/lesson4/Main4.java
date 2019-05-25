package lesson4;

public class Main4 {
    public static void main(String[] args) {
        String text = "qwertyihh";
        char[] simbolsFromtext = text.toCharArray();

        for (int i = 0; i < simbolsFromtext.length; i++) {
            if (simbolsFromtext[i] == 'a' || (simbolsFromtext[i]) == 'e' || (simbolsFromtext[i]) ==
                    'i' || (simbolsFromtext[i]) == 'y') {
                char result = simbolsFromtext[i];
                System.out.println(result);

            }

        }
    }

}