package _01_Method;

public class _02_ParametreliMetodlar {

    public static void main(String[] args) {

        selamlama("Hüseyin");
        selamlama("Şenay");
        System.out.println("*********************");

        toplama(3,4,5);
        toplama(10,12,20);

    }

    public static void selamlama(String name)  {

        System.out.println("Selamlar " + name);
    }

    public static void toplama(int num1, int num2, int num3) {
        int sum =0;
        sum = num1 + num2 + num3;
        System.out.println("Toplamları = " + sum);
    }
}
