package _02_Classlar._02_ATM_Projesi;

import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap){

        Login login = new Login();

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz...");
        System.out.println("************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*************************");
        int girisHakki = 3;

        while (true){
            if (login.login(hesap)){
                System.out.println("Giriş Başarılı...");
                break;
            }
            else {
                System.out.println("Giriş Başarısız...");
                girisHakki -= 1;
                System.out.println("Kalan Giriş Hakkı = " + girisHakki);
            }
            if (girisHakki == 0){
                System.out.println("Giriş hakkınız bitti");
                return;
            }
        }

        System.out.println("************************************");
        String islemler = "1.Bakiye Görüntüle\n" + "2.Para Yatırma\n" +
                "3.Para Çekme\n" + "Çıkış için q'ya basın";

        System.out.println(islemler);

        while (true){
            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                break;
            }

            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }

            else if (islem.equals("2")){
                System.out.print("Yatırmak istediğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCekme(tutar);
            }
            else {
                System.out.println("Böyle bir işlem bulunmamaktadır...");
            }
        }





    }
}
