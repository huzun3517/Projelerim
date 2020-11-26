package PROJE;

import _02_Classlar._06_CalisanlarProjesi.Yazilimci;

import java.util.Scanner;

public class MainCalisan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");

        String islemler = "İşlemler...\n"
                + "1.Yazılımcı İlemleri\n"
                + "2.Yönetici İşlemleri\n"
                + "Çıkış için q' ya basın";

        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");

        while (true) {
            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (islem.equals("1")) {

                Yazilimci yazilimci = new Yazilimci("Bekir","Abi",567,"Java,C,Phyton");
                System.out.println("*************************");
                String yazilimciIslemleri = "Yazılımcı işlemleri\n"
                        + "1.Format At\n"
                        + "2.Bilgileri Göster\n"
                        + "3.Çıkış için q'ya basınız";
                System.out.println(yazilimciIslemleri);
                System.out.println("*************************");

                while (true) {
                    System.out.print("İşlem seçiniz: ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }

                    else if (y_islem.equals("1")) {
                        System.out.print("İşletim Sistemi: ");
                        String isletimSistemi =scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }

                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz yazılımci işlemleri....");
                    }


                }



            }

            else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("Salih","Abi",123,10);

                String yonetici_islemleri = "Yönetici işlemleri\n"
                + "1.Zam Yap\n"
                + "2.Bilgileri Göster\n"
                + "Çıkış için q'ya basınız";
                System.out.println("*************************");
                System.out.println(yonetici_islemleri);
                System.out.println("*************************");

                while (true) {
                    System.out.print("işlem seçiniz: ");
                    String yonetIslem = scanner.nextLine();

                    if (yonetIslem.equals("q")) {
                        System.out.println("Yönetici işlemlerinden çıkılıyor.");
                        break;
                    }

                    else if (yonetIslem.equals("1")){
                        System.out.print("Yöneticinin nekadar zam yapmasını istiyorsunuz: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);

                    }
                    else if (yonetIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }

                    else {
                        System.out.println("Geçersiz Yönetici işlemleri");
                    }
                }




            }

            else {
                System.out.println("Hatalı giriş yaptınız....");
            }
        }




    }
}
