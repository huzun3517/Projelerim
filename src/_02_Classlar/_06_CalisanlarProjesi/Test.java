package _02_Classlar._06_CalisanlarProjesi;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz...");
        String islemler = "İşlemler\n" + "1.Yazılımcı İşlemleri\n"
                + "2.Yönetici İşlemleri\n"
                + "Çıkış için q'ya basın";
        System.out.println("**************************************");
        System.out.println(islemler);
        System.out.println("**************************************");

        while (true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Çalışanlar Programından çıkılıyor...");
                break;
            }

            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Hüseyin","Uzun",567,"Java,C");
                String yazilimciIslemlemleri = "1.Format At\n" +
                        "2.Bilgileri Göster\n" +
                        "Çıkış için q'ya basın";
                System.out.println(yazilimciIslemlemleri);

                while (true){
                    System.out.print("İşlemi seçin: ");
                    String yazilimciIslem = scanner.nextLine();

                    if (yazilimciIslem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if (yazilimciIslem.equals("1")){
                        System.out.print("İşletim sistemi: ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);

                    }
                    else if (yazilimciIslem.equals("2")){
                        yazilimci.bilgileriGoster();

                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi...");
                    }

                }


            }

            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Senay","Uzun",123,10);

                String yoneticiIslemleri = "Yönetici İşlemleri\n" +
                        "1.Zam Yap\n" +
                        "2.Bilgileri Goster\n" +
                        "Çıkış için q'ya basın";
                System.out.println(yoneticiIslemleri);

                while (true) {
                    System.out.print("İşlem Seçiniz: ");
                    String yoneticiIslem = scanner.nextLine();

                    if (yoneticiIslem.equals("q")){
                        System.out.println("Yonetici İşlemlerinden Çıkılıyor...");
                        break;
                    }
                    else if (yoneticiIslem.equals("1")){
                        System.out.print("Yöneticinin nekadar zam yapmasını istiyorsunuz: ");
                        int zamMiktarı = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktarı);
                    }
                    else if (yoneticiIslem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi");
                    }

                }

            }

            else {
                System.out.println("Geçersiz işlem");
            }
        }


    }
}
