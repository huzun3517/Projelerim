package _02_Classlar._04_InheritanceProje1;

public class Yonetici extends Calisan { // SubClass

    private int sorumluKisiSayisi; // Ekstra özellik

    public Yonetici(String isim, int maas, String departman, int sorumluKisiSayisi) {
        super(isim, maas, departman);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    public void zamYap(int zamMiktari) {

        System.out.println("Çalışanlara " + zamMiktari + " Euro zam yapıldı.");
    }

    public void bilgileriGoster(){
       /* System.out.println("İsim : " + getIsim()) ;
        System.out.println("Maaş : " + getMaas());
        System.out.println("Departman : " + getDepartman());
        */

        super.bilgileriGoster();
        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumluKisiSayisi);

    }








}
