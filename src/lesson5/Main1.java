package lesson5;

public class Main1 {
    public static void main(String[] args) {
        int[] massive = {1, 23, 88, 77, 25};
        int biggest = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > biggest) {
                biggest = massive[i];
            }
        }
        System.out.println(biggest);

        int biggest2 = 0;
        for (int j = 0; j < massive.length; j++) {
            if (massive[j]>biggest2 && massive[j] < biggest){
                biggest2 = massive[j];
            }
        }
        System.out.println(biggest2);
    }
}

// вывести 2 самых больших числа из массива