package test;

public class Test3 {
    public static void main(String[] args) {
        String text = "I am learnig java";
        String[] words = text.split(" ");

        for (String temp : words) {
            System.out.println(temp);
        }   // цикл for each (для каждого)



//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//    }
    }
}

