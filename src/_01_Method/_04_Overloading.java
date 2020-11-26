package _01_Method;

public class _04_Overloading {

    public static void main(String[] args) {

        toplama(3,4,5);
        toplama(2,5);
        System.out.println("*********************");

        toplama("Hüseyin","Uzun");
        System.out.println("*********************");

        skorhesapla("Hüseyin",1000);
        skorhesapla(1500);
        skorhesapla("Senay");


    }
    public static void toplama(int num1, int num2, int num3) {
        int sum =0;
        sum = num1 + num2 + num3;
        System.out.println("Toplamları = " + sum);
    }

    public static void toplama(int num1, int num2) {
        int sum =0;
        sum = num1 + num2;
        System.out.println("Toplamları = " + sum);
    }

    public static void toplama(String s1, String s2) {
        String sum = "";
        sum = s1 + " " +  s2;
        System.out.println("Toplamları = " + sum);
    }

    public static void skorhesapla(String name, int puan) {
        System.out.println(name + " adlı oyuncunun " + puan + " puanı var");
    }

    public static void skorhesapla(int puan) {
        System.out.println("isimsiz oyuncunun " + puan + " puanı var");
    }

    public static void skorhesapla(String name) {
        System.out.println(name + " adlı oyuncunun hiç puanı yok");
    }

}
