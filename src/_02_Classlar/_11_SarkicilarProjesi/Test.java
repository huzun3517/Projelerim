package _02_Classlar._11_SarkicilarProjesi;

import java.util.Scanner;

public class Test {

    private static Sarkicilar sarkicilar = new Sarkicilar();

    private static Scanner scanner = new Scanner(System.in);

    public static void islemleriBastir(){

        System.out.println("\t 0-İşlemleri Görüntüle");
        System.out.println("\t 1-Şarkıcıları Görüntüle");
        System.out.println("\t 2-Şarkıcı Ekle");
        System.out.println("\t 3-Şarkıcı Güncelle");
        System.out.println("\t 4-Şarkıcı Sil");
        System.out.println("\t 5-Şarkıcı Ara");
        System.out.println("\t 6-Uygulamadan Çık");
    }

    public static void sarkiciGoruntule(){
        sarkicilar.sarkicilariBastir();

    }

    public static void sarkiciEkle(){

        System.out.print("Eklemek istediğiniz şarkıcının ismi: ");
        String isim = scanner.nextLine();

        sarkicilar.sarkiciEkle(isim);
    }

    public static void  sarkiciGuncelle(){

        System.out.print("Güncellemek istediğiniz pozisyon(1,2,3): ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Yeni isim: ");
        String yeniIsim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeniIsim,pozisyon-1);
    }

    public static void sarkiciSil(){
        System.out.print("Silmek istediğiniz pozisyon(1,2,3): ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        sarkicilar.sarkiciSil(pozisyon-1);
    }

    public static void sarkiciAra(){
        System.out.print("Aramak istediğiniz sarkici: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkiciAra(isim);
    }




    public static void main(String[] args) {

        System.out.println("\t Şarkıcı uygulamasına hoşgeldiniz...");

        islemleriBastir();

        boolean cikis = false;

        int islem;


        while (!cikis){

            System.out.print("Bir işlem seçiniz: ");
            islem = scanner.nextInt();
            scanner.nextLine();

            switch (islem){
                case 0: islemleriBastir();
                break;
                case 1: sarkiciGoruntule();
                break;
                case 2: sarkiciEkle();
                break;
                case 3: sarkiciGuncelle();
                break;
                case 4: sarkiciSil();
                break;
                case 5: sarkiciAra();
                break;
                case 6: cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                break;
            }

        }






    }




}
