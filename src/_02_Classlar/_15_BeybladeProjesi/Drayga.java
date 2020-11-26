package _02_Classlar._15_BeybladeProjesi;

public class Drayga extends Beyblade {

    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;

    }

    @Override
    public void kutsalCanavarortayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkartıyor...");
        System.out.println(getBeybladeci() + " in Saldırısı : Kaplan Pençesi...");
    }

    @Override
    public void bilileriGoster() {
        super.bilileriGoster();
        System.out.println("Kutsal Canavar adı: " + kutsalCanavar);
    }
}
