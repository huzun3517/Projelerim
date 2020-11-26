package _02_Classlar._13_Encapsulation;

public class Test {

    public static void main(String[] args) {

    /*    Abone abone = new Abone();

        abone.isim = "Hüseyin Uzun";
        abone.bakiye = 200;
        abone.sehir = "Izmir";

        abone.dogalgazKullan(200);

     */

        GelismisAbone abone = new GelismisAbone("Hüseyin Uzun",200,"Izmir");
        abone.bakiyeOgren();
        abone.dogalgazKullan(100);





    }
}
