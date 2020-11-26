package _01_Method;

import java.util.Scanner;

public class _08_MiniProje_Method_Overloading_HesapMakinesi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "1.Toplama İşlemei\n"
                + "2.Çıkarma İşlemi\n"
                + "3.Çarpma İşlemi\n"
                + "4.Bölme İşlemi\n"
                + "Çıkış için q'ya basın";
        System.out.println("*****************************************");
        System.out.println(islemler);
        System.out.println("*****************************************");

        while (true) {
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;

            } else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız? (2 veya 3): ");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("num1 : ");
                    int num1 = scanner.nextInt();

                    System.out.print("num2: ");
                    int num2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların toplamı= " + toplama(num1, num2));
                }

                else if (kacsayi == 3) {
                    System.out.print("num1 : ");
                    int num1 = scanner.nextInt();

                    System.out.print("num2: ");
                    int num2 = scanner.nextInt();

                    System.out.print("num3: ");
                    int num3 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların toplamı= " + toplama(num1, num2,num3));
                }

                else {
                    System.out.println("Bunun için uygun metod bulunmuyor.");
                }
            }

            else if (islem.equals("2")) {
                System.out.print("num1 : ");
                int num1 = scanner.nextInt();

                System.out.print("num2: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sayıların farkı= " + cikarma(num1,num2));

            }

            else if (islem.equals("3")) {
                System.out.print("Kaç değer carpacaksınız? (2 veya 3): ");

                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("num1 : ");
                    int num1 = scanner.nextInt();

                    System.out.print("num2: ");
                    int num2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların carpımı= " + carpma(num1, num2));
                }

                else if (kacsayi == 3) {
                    System.out.print("num1 : ");
                    int num1 = scanner.nextInt();

                    System.out.print("num2: ");
                    int num2 = scanner.nextInt();

                    System.out.print("num3: ");
                    int num3 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların carpımı= " + carpma(num1, num2, num3));
                }

                else {
                    System.out.println("Bunun için uygun metod bulunmuyor.");
                }
            }

            else if (islem.equals("4")){
                System.out.print("num1 : ");
                int num1 = scanner.nextInt();

                System.out.print("num2: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayıların bolumu= " + bolme(num1, num2));
            }
        }
    }

    public static int cikarma ( int num1, int num2){

        return num1 - num2;
    }

    public static double bolme ( int num1, int num2){

        return ((double) num1 / num2);
    }

    public static int toplama ( int num1, int num2){

        return num1 + num2;
    }

    public static int toplama ( int num1, int num2, int num3){

        return num1 + num2 + num3;
    }

    public static int carpma ( int num1, int num2){

        return num1 * num2;
    }

    public static int carpma ( int num1, int num2, int num3){

        return num1 * num2 * num3;
    }

}
