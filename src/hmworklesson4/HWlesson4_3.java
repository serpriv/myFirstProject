package hmworklesson4;

public class HWlesson4_3 {
    public static void main(String[] args) {
        char[] massive = {'a', 'b', 'c', 'd'};
        char[] massiveReverse = new char[massive.length];

//        massiveReverse[0] = massive[3];
//        massiveReverse[1] = massive[2];
//        massiveReverse[2] = massive[1];
//        massiveReverse[3] = massive[0];

        int j = massiveReverse.length - 1;

        for (int i = 0; i < massive.length; i++) {
            massiveReverse[i] = massive[j];
            j--;

        }
        for (int i = 0; i < massiveReverse.length; i++) {
            System.out.println(massiveReverse[i]);
        }


    }
}
