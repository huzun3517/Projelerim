package _02_Classlar._02_ATM_Projesi;

public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Hesap hesap = new Hesap("Hüseyin Uzun","12345",2000);

        atm.calis(hesap);

        System.out.println("Programdan çıkılıyor....");
    }
}
