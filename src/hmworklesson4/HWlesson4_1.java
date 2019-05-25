package hmworklesson4;

public class HWlesson4_1 {
    public static void main(String[] args) {
        String text = "I am happy to learning java";
        String[] parts = text.split(" ");
//        System.out.println(parts[5]);
//        System.out.println(parts[4]);
//        System.out.println(parts[3]);
//        System.out.println(parts[2]);
//        System.out.println(parts[1]);
//        System.out.println(parts[0]);
        for (int i = parts.length - 1; i >= 0; i--) {
            System.out.println(parts[i]);
        }
    }
}
