package _02_Classlar._07_KahveDukkaniProjesi;

public class test {

    public static void main(String[] args) {

        bakiye musteriler = bakiye.MUSTERI1;
        icecekler icecek = icecekler.GAZOZ;
        tatlilar tatli = tatlilar.CİLEKLİPASTA;

        double icecekFiyati = icecek.getFiyat();
        double tatliFiyati = tatli.getTatlifiyati();
        double bakiyem = musteriler.getBakiyem();
        double topTutar = icecekFiyati + tatliFiyati;
        double paraUstu = bakiyem-topTutar;



        if (topTutar > bakiyem){
            System.out.println("Bakiyeniz yetersiz. Bakiyeniz: " + musteriler.getBakiyem());
        }
        else {
            System.out.println("müşteri = " + musteriler.name());
            System.out.println("icecek = " + icecek);
            System.out.println("tatli = " + tatli);
            System.out.println("topTutar = " + topTutar);
            System.out.println("paraUstu = " + paraUstu);
        }



    }
}
