package _02_Classlar._12_CompositionProje;

public class Bilgisayar {

    private Anakart anakart;
    private Monitor monitor;
    private Kasa kasa;

    public Bilgisayar(Anakart anakart, Monitor monitor, Kasa kasa) {
        this.anakart = anakart;
        this.monitor = monitor;
        this.kasa = kasa;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
}
