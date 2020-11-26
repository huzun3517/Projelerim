package _02_Classlar._15_BeybladeProjesi;

public class Dragon extends Beyblade {

    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarortayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çıkartıyor...");
        System.out.println(getBeybladeci() + " in Saldırısı : Hayalet Kasırgası...");
    }

    @Override
    public void bilileriGoster() {
        System.out.println("Kutsal Canavar adı: " + kutsalCanavar);
        System.out.println("Gizli Yetenek: " + gizliYetenek);
    }


}
