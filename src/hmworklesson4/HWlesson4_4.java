package hmworklesson4;

public class HWlesson4_4 {
    public static void main(String[] args) {
        char[] massive1 = {'q', 'w', 'e', 'r'};
        char[] massive2 = {'a', 'b', 'c', 'd'};

        char[] massive1Big = {'Q', 'W', 'E', 'R'};
        char[] massive2Big = {'A', 'B', 'C', 'D'};

        String text = "AQre YQou ready to start studying of programming?";

        char[] textMassive = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < massive1.length; j++) {
                if (textMassive[i] == massive1[j]) {
                    textMassive[i] = massive2[j];

                }

            }

        }
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < massive1Big.length; j++) {
                if (textMassive[i] == massive1Big[j]) {
                    textMassive[i] = massive2Big[j];

                }

            }

        }
        System.out.println(textMassive);

    }
}

