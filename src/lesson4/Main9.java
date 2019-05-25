package lesson4;

public class Main9 {
    public static void main(String[] args) {
        String text = "I am learning java";
        String text1 = text.replace("a" , "?");
        String text2 = text1.replace("I" , "?");
        String text3 = text2.replace("e" , "?");
        String text4 = text3.replace("i" , "?");
        System.out.println(text4);
    }
}
