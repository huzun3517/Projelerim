package _02_Classlar._09_enumProje;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Kitap kitap1 = new Kitap();
        kitap1.name = "Sefiller";
        kitap1.katogori = KitapKategori.ROMAN;

        Kitap kitap2 = new Kitap();
        kitap2.name = "Suç ve Ceza";
        kitap2.katogori = KitapKategori.ROMAN;

        ArrayList<Kitap> kitaplar = new ArrayList<>();
        kitaplar.add(kitap1);
        kitaplar.add(kitap2);

        for (Kitap k: kitaplar){
            System.out.println("name: " + k.name);
        }




    }
}
