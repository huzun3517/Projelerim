package _01_Method;

public class _06_MiniProje_1000eKadarOlanAsalSayilar {

    public static void main(String[] args) {

        for (int i = 2; i < 1000 ; i++) {

            if (asalMi(i)) {
                System.out.println(i);
            }

        }


    }

    public static boolean asalMi(int num) {

        for (int i = 2; i < num ; i++) {

            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}
