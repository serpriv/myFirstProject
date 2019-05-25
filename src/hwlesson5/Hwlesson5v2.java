package hwlesson5;

public class Hwlesson5v2 {
    public static void main(String[] args) {
        String text = "Hello, world!";

        char[] glasnye = {'a', 'e', 'i', 'o', 'y', 'u'};
        char[] znaki = {',', ':', '!', '?', ';', '-'};
        char[] soglasnye = "bcdfghjklmnpqrstwxzBCDFGHKLMNPQRSTWXWZ".toCharArray();

        int kolichestvoZnakov = 0;
        int kolichestvoGlasnyh = 0;
        int kolichestvoSoglasnyh = 0;

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < glasnye.length; j++) {
                if (text.charAt(i) == glasnye[j]) {
                    kolichestvoGlasnyh++;
                }
            }
            for (int j = 0; j < soglasnye.length; j++) {
                if (text.charAt(i) == soglasnye[j]) {
                    kolichestvoSoglasnyh++;
                }
            }
            for (int j = 0; j < znaki.length; j++) {
                if (text.charAt(i) == znaki[j]) {
                    kolichestvoZnakov++;
                }
            }
        }
        System.out.println("Кол-во гласных = " + kolichestvoGlasnyh);
        System.out.println("Кол-во согласных = " + kolichestvoSoglasnyh);
        System.out.println("Кол-во знаков = " + kolichestvoZnakov);
    }
}
