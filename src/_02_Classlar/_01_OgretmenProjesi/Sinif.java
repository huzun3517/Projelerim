package _02_Classlar._01_OgretmenProjesi;

public class Sinif {

    String konu;
    Ogretmen ogretmen;
    Ogrenci ogrenci;


    public static Sinif sinifEkle(String konu,  Ogrenci ogrenci, Ogretmen ogretmen) {

        Sinif sinif = new Sinif();
        sinif.konu = konu;
        sinif.ogrenci = ogrenci;
        sinif.ogretmen = ogretmen;

        return sinif;
    }

    public void printSinif(Sinif sinif, Ogrenci ogrenci, Ogretmen ogretmen){

        System.out.println("*****Sınıf Bilgileri*****");
        System.out.println("konu = " + sinif.konu);
        ogrenci.printOgrenci(ogrenci);
        ogretmen.printOgretmen(ogretmen);
    }

}
