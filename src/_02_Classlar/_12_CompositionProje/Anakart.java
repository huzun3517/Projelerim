package _02_Classlar._12_CompositionProje;

public class Anakart {

    private String model;
    private String uretici;
    private int yuva_sayisi;
    private String isletim_sitemi;

    public Anakart(String model, String uretici, int yuva_sayisi, String isletim_sitemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuva_sayisi = yuva_sayisi;
        this.isletim_sitemi = isletim_sitemi;
    }

    public void isletimSistemiYukle(String isletim_sitemi) {

        this.isletim_sitemi = isletim_sitemi;

        System.out.println("İşletim sitemi yüklendi: " + this.isletim_sitemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuva_sayisi() {
        return yuva_sayisi;
    }

    public void setYuva_sayisi(int yuva_sayisi) {
        this.yuva_sayisi = yuva_sayisi;
    }

    public String getIsletim_sitemi() {
        return isletim_sitemi;
    }

    public void setIsletim_sitemi(String isletim_sitemi) {
        this.isletim_sitemi = isletim_sitemi;
    }


}
