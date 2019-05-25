package lesson5;

public class Main {
    public static void main(String[] args) {
        String text = "I like to learn java";
        char[] alphabet = "abcdefgihjklmnopqrstuvwxyz".toCharArray();

        int[] count = new int[alphabet.length];
        for (int i = 0; i < alphabet.length; i++) {
            int countCurrentChar = 0;
            for (int j = 0; j < text.length(); j++) {
                if (alphabet[i] == text.charAt(j)) {
                    countCurrentChar++;
                }
            }
            count[i] = countCurrentChar;
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + "-" + count[i]);
        }
    }
}

// вывести количество каждой буквы в text