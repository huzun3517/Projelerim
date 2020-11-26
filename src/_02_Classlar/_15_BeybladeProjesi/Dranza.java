package _02_Classlar._15_BeybladeProjesi;

public class Dranza extends Beyblade {

    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarortayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkartıyor...");
        System.out.println(getBeybladeci() + " in Saldırısı : Alev Kılıcı...");
    }

    @Override
    public void bilileriGoster() {
        super.bilileriGoster();
        System.out.println("Kutsal Canavar adı: " + kutsalCanavar);
    }
}
