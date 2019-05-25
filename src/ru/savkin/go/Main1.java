package ru.savkin.go;

public class Main1 {

    public static void main(String[] args) {
        int[] massive = {2, 3, 55, 77, 223, 24};
        int max =  massive[0];
        for (int i = 1; i < massive.length; i++) {
            if (massive [i] > max) {
                max = massive[i];
            }

        }

        System.out.println("max element is " + max);

        int max2 = massive[0];
        for (int i = 1; i < massive.length; i++ ) {
            if (massive[i] > max2 && massive[i] < max) {
                max2 = massive[i];
            }
        }
        System.out.println("second max element is " + max2);
    }


}
