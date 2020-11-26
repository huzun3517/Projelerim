package _01_Method;

import java.util.Scanner;

public class _01_MethodlaraGiris {

    public static void main(String[] args) {

        selamlama();

        System.out.println("*******************");

        faktoriyel();


    }

    public static void selamlama() {

        System.out.println("Merhaba Nasılsınız ?");
        System.out.println("Selamlar");

    }

    public static void faktoriyel() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i <= num ; i++) {
            faktoriyel*= i;
        }
        System.out.println("faktoriyel = " + faktoriyel);
    }
}
