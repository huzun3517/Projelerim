package _02_Classlar._08_Ogrenci_DersProjesi;

import java.util.ArrayList;

public class Student {

    String name;
    int maxCredit;
    ArrayList<Lesson> dersler = new ArrayList<>();

    public static Student createStudent(String name, int maxCredit){
        Student ogrenci = new Student();
        ogrenci.name = name;
        ogrenci.maxCredit = maxCredit;
        return ogrenci;

    }

    public void lessonAdd(Lesson ders) {

        int ogrTopDersSaati = 0;

        for (Lesson aldDers: dersler){
            ogrTopDersSaati += aldDers.credit;
        }

        if (ogrTopDersSaati + ders.credit < maxCredit){
            dersler.add(ders);
        }
        else {
            System.out.println(name + " " + ders.name + " dersini Max saati aştığı için alamaz....");
        }
    }

    public void printLesson(){
        System.out.println(name + " isimli öğrencinin aldığı derler: ");
        int aldigiTopsaat = 0;

        for (Lesson ders: dersler){
            System.out.println(ders.name + " " + ders.credit);
            aldigiTopsaat += ders.credit;
        }
        System.out.println("Aldığı toplam saat: " + aldigiTopsaat);
    }

}
