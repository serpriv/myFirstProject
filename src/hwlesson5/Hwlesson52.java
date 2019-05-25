package hwlesson5;

public class Hwlesson52 {
    public static void main(String[] args) {
        String text = "Hello, world!";
        String text2 = "Hallo Welt.";

        String kakieSimvolyUsheBilyNapechtany = "";//= new String();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text.charAt(i) == text2.charAt(j)) {
                    /*
                    * метод   contains проверяет, есть ли символ  String.valueOf(text.charAt(i)
                    * в строке kakieSimvolyUsheBilyNapechtany. Если да, то он возвращает результат true
                    * и срабатывает if.
                    * Иначе выполняется ветка else
                    * */

                    if (kakieSimvolyUsheBilyNapechtany.contains(String.valueOf(text.charAt(i)))) {

                    } else {
                        kakieSimvolyUsheBilyNapechtany = kakieSimvolyUsheBilyNapechtany + text.charAt(i);
                        System.out.println(text.charAt(i));
                    }
                }
            }

        }
    }
}
