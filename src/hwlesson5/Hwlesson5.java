package hwlesson5;

public class Hwlesson5 {
    public static void main(String[] args) {

        String text = "Hello, world!";
        //  char[] glasnye = {'a', 'e', 'i', 'o', 'y', 'u'};
        // char[] soglasnye = "bcdfghjklmnpqrstwxz".toCharArray();
        String znaki = ",.!;':?";
        String glasnye = "aeioyu";
        String soglasnye = "bcdfghjklmnpqrstwxz";
//        System.out.println(soglasnye.contains("c"));
//        System.out.println(text.charAt(0));
        int kolichestvoZnakov = 0;
        int kolichestvoGlasnyh = 0;
        int kolichestvoSoglasnyh = 0;


        for (int i = 0; i < text.length(); i++) {
            if (znaki.contains(String.valueOf(text.charAt(i)))) {
                kolichestvoZnakov++;
            }
            if (glasnye.contains(String.valueOf(text.charAt(i)))) {
                kolichestvoGlasnyh++;
            }
            if (soglasnye.contains(String.valueOf(text.charAt(i)))) {
                kolichestvoSoglasnyh++;
            }

        }
        System.out.println("кол-во знаков препинания = " + kolichestvoZnakov);
        System.out.println("кол-во гласных букв = " + kolichestvoGlasnyh);
        System.out.println("кол-во согласных букв = " + kolichestvoSoglasnyh);

    }
}
