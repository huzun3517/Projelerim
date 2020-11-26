package _01_Method;

import java.util.Scanner;

public class _07_MiniProje_ikiSayininEbobunuBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayı: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayı: ");
        int num2 = scanner.nextInt();

        System.out.println("İki sayının ebobu= " + ebobBulma(num1,num2));


    }

    public static int ebobBulma(int num1, int num2) {

        int ebob =1;

        for (int i = 1; i <= num1 && i <= num2 ; i++) {

            if ((num1 % i == 0) && (num2 % i == 0)){
                ebob = i;
            }

        }
        return ebob;
    }
}
