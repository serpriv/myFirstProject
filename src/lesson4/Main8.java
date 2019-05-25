package lesson4;

public class Main8 {
    public static void main(String[] args) {
        String text = "I am,  learning java!233 dfe, ..";
        String text1 = text.replace(",", "");
        String text2 = text1.replace("  ", " ");
        String text3 = text2.replace("!", "");
        String text4 = text3.replace(".", "");

       String[] words = text4.split( " " );

       for (String currentText : words){
           System.out.println(currentText);
       }
    }
}
