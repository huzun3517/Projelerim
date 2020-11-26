package _02_Classlar._08_Ogrenci_DersProjesi;

public class Lesson {

    String name;
    int credit;


    public static Lesson creatLesson(String name, int credit) {
        Lesson ders = new Lesson();
        ders.name = name;
        ders.credit = credit;
        return ders;
    }
}
