package test;

public class MethodTest4 {
//    public static int summaChiselBy5(int[] massive) {
//        int summaChiselBy5 = 0;
//        for (int temp : massive) {
//            if (temp % 5 == 0) {
//                summaChiselBy5 += temp;
//            }
//        }
//        return summaChiselBy5;
//    }

    public static int summaChiselBy5(int[] massive) {
        int summaChiselBy5 = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 5 == 0) {
                summaChiselBy5 = summaChiselBy5 + massive[i];
            }
        }
        return summaChiselBy5;
    }
}




