package homework;

public class Homework23 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 50; i <= 1000; i++) {
            if (i % 7 == 0 && i % 19 == 0)
                sum +=i;
        }
        System.out.println(sum);
    }
}

