package _02_Classlar._01_OgretmenProjesi;

public class Ogretmen {

    String isim;
    int deneyim;
    String bolum;

    public static Ogretmen ogretmenEkle(String isim, int deneyim, String bolum){

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.isim = isim;
        ogretmen.bolum = bolum;
        ogretmen.deneyim = deneyim;

        return ogretmen;

    }

    public void ogretmenimNasil(){

        if (deneyim < 2){
            System.out.println("idare eder");
        }
        else if (deneyim >=2 && deneyim<4){
            System.out.println("daha iyisi olabilirdi");
        }
        else if (deneyim > 4){
            System.out.println("daha ne olsun, adam super");
        }

    }

    public void printOgretmen(Ogretmen ogretmen){

        System.out.println("*****Öğretmen Bilgileri*****");
        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.bolum = " + ogretmen.bolum);
        System.out.println("ogretmen.deneyim = " + ogretmen.deneyim);
        ogretmen.ogretmenimNasil();
    }

}
