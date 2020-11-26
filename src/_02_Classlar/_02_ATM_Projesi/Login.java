package _02_Classlar._02_ATM_Projesi;

import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap){

        Scanner scanner = new Scanner(System.in);
        String kullaniciadiGirilen;
        String parolaGirilen;

        System.out.print("Kullanıcı adı: ");
        kullaniciadiGirilen = scanner.nextLine();

        System.out.print("Parola: ");
        parolaGirilen = scanner.nextLine();

        if (hesap.getKullaniciadi().equals(kullaniciadiGirilen) && hesap.getParola().equals(parolaGirilen)){
            return true;
        }
        else {
            return false;
        }
    }
}
