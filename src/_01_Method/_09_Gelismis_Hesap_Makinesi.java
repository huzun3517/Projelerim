package _01_Method;

import java.util.Scanner;

public class _09_Gelismis_Hesap_Makinesi {

    public static int toplama(int a, int b){
        return (a + b);
    }

    public static int toplama(int a, int b, int c){
        return (a + b + c);
    }

    public static int cıkarma(int a, int b){
        return (a - b);
    }

    public static int carpma(int a, int b){
        return (a * b);
    }

    public static int carpma(int a, int b, int c){
        return (a * b * c);
    }

    public static double bolme(int a, int b){
        return ((double)a / b);
    }

    public static double karekok(int a){
        return (Math.sqrt(a));
    }

    public static int faktoriyel(int a){

        int faktoriyel = 1;

        for (int i = 1; i <= a; i++){
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }

    public static double usalma(double a,double b){
        return Math.pow(a,b);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String islemler = "1.İşlem: Toplama\n" + "2.İşlem: Çıkarma\n"
                + "3.İşlem: Çarpma\n" + "4.İşlem: Bölme\n"
                + "5.İşlem: Karekök Bulma\n" + "6.İşlem: Faktoriyel Bulma\n"
                + "7.İşlem : Üs Alma\n" + "Çıkış: q";

        System.out.println("HESAP MAKİNESİ");
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");

        while (true){
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (islem.equals("1")) {

                System.out.print("Kaç değer toplayacaksınız ? (2 veya 3): ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2){
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların toplamları: " + toplama(a,b));
                }

                else if (kacsayi ==3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların toplamları: " + toplama(a,b,c));
                }

                else {
                    System.out.println("Bunun için uygun metot bulunmuyor...");
                }
            }

            else if (islem.equals("2")){
                System.out.print("a: ");
                int a = scanner.nextInt();

                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayıların farkı: " + cıkarma(a,b));
            }

            else if (islem.equals("3")) {
                System.out.print("Kaç değer carpacaksınız ? (2 veya 3): ");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların carpımları: " + carpma(a, b));

                } else if (kacsayi == 3) {
                    System.out.print("a: ");
                    int a = scanner.nextInt();

                    System.out.print("b: ");
                    int b = scanner.nextInt();

                    System.out.print("c: ");
                    int c = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Girilen sayıların carpımları: " + carpma(a, b, c));

                } else {
                    System.out.println("Bunun için uygun metot bulunmuyor...");
                }
            }

            else if (islem.equals("4")){
                System.out.print("a: ");
                int a = scanner.nextInt();

                System.out.print("b: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayıların bölümü: " + bolme(a,b));
            }

            else if (islem.equals("5")){
                System.out.print("a: ");
                int a = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayının karekökü: " + karekok(a));
            }

            else if (islem.equals("6")){
                System.out.print("a: ");
                int a = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Girilen sayının faktoriyeli: " + faktoriyel(a));
            }

            else if (islem.equals("7")){
                System.out.print("Üssü alınacak sayı: ");
                int a = scanner.nextInt();

                System.out.print("Üssü: ");
                int b = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Sonuç: " + usalma(a,b));
            }

            else {
                System.out.println("Hatalı giriş yaptınız. Böyle bir işlem yoktur...");





        }


            }

        }








    }

