package _02_Classlar._01_OgretmenProjesi;

public class Ogrenci {

    String isim;
    String bolum;
    int yas;
    int ilkSinav;
    int ikinciSinav;
    int ucunceSinav;

    public static Ogrenci ekleOgrenci(String isim,String bolum,int yas,int ilkSinav,int ikinciSinav,int ucunceSinav) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.isim = isim;
        ogrenci.yas = yas;
        ogrenci.bolum = bolum;
        ogrenci.ilkSinav = ilkSinav;
        ogrenci.ikinciSinav = ikinciSinav;
        ogrenci.ucunceSinav = ucunceSinav;

        return ogrenci;
    }

    public int notOrtalamasi(){

        int ort = (ilkSinav + ikinciSinav + ucunceSinav) / 3;

        return ort;

    }

    public void printOgrenci(Ogrenci ogrenci){

        System.out.println("*****Öğrenci Bilgileri*****");
        System.out.println("ogrenci ismi = " + ogrenci.isim);
        System.out.println("ogrenci bolum = " + ogrenci.bolum);
        System.out.println("ogrenci yas = " + ogrenci.yas);
        System.out.println("ogrenci sınav1 = " + ogrenci.ilkSinav);
        System.out.println("ogrenci sınav2 = " + ogrenci.ikinciSinav);
        System.out.println("ogrenci sınav3 = " + ogrenci.ucunceSinav);
        System.out.println("ogrenci not ortalaması = " + ogrenci.notOrtalamasi());
    }

}
