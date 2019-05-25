package test;

public class Mainzadachi {
    public static void main(String[] args) {
        boolean otvet = Zadachi.checkSumTwoChiselOt10do20vkl(88, 5);
        System.out.println(otvet);
        System.out.println(Zadachi.checkSumTwoChiselOt10do20vkl(2,13));

        Zadachi.checkPlusOrMinus(-5);
        Zadachi.checkPlusOrMinus(0);
    }

}
