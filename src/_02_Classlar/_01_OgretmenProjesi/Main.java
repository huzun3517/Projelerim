package _02_Classlar._01_OgretmenProjesi;

public class Main {

    public static void main(String[] args) {

        Ogrenci ogrenci= new Ogrenci();
        Ogretmen ogretmen = new Ogretmen();

        Ogrenci ogrenci1 = Ogrenci.ekleOgrenci("Hasan","Bilgisayar",20,69,75,89);
        Ogretmen ogretmen1 = Ogretmen.ogretmenEkle("Ali",5,"Mühendis");

        Sinif sinif = new Sinif();
        Sinif sinif1 = Sinif.sinifEkle("Java",ogrenci1,ogretmen1);
        sinif.printSinif(sinif1,ogrenci1,ogretmen1);

    }
}
