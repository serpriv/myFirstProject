package lesson5;

public class Main4 {
    public static void main(String[] args) {
        String text = "orange mango apple";
        String[] words = text.split(" ");
        String[] wordsReverse = new String[words.length];

//        wordsReverse[0] = words[2];
//        wordsReverse[1] = words[1];
//        wordsReverse[2] = words[0];

        for (int i = 0, j = words.length - 1; i < words.length; i++, j--) {
            wordsReverse[i] = words[j];
            System.out.println(wordsReverse[i]);
        }
    }
}
