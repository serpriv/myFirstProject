package lesson6;

public class Main {
    public static void main(String[] args) {
        String text = "I am a student";
        String text2 = "I am a teacher";

        char[] charFromText1 = text.toCharArray();
        char[] charFromText2 = text.toCharArray();

        for (int i = 0; i < charFromText1.length; i++) {
            for (int j = 0; j < charFromText2.length; j++) {
                if (charFromText1[i] == charFromText2[j] && charFromText1[i] != ' ') {
                    System.out.println(charFromText1[i]);
                    break;
                }

            }
        }
    }
}
