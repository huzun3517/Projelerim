package _02_Classlar._08_Ogrenci_DersProjesi;

public class Test {

    public static void main(String[] args) {

        Lesson mat = Lesson.creatLesson("Matematik",6);
        Lesson fiz = Lesson.creatLesson("Fizik",4);
        Lesson kim = Lesson.creatLesson("Kimya",6);
        Lesson spor = Lesson.creatLesson("Spor",2);
        Lesson java = Lesson.creatLesson("Java",6);

        Student ogrenci1 = Student.createStudent("Faruk",20);
        Student ogrenci2 = Student.createStudent("Yeliz",12);

        ogrenci1.lessonAdd(mat);
        ogrenci1.lessonAdd(fiz);
        ogrenci1.lessonAdd(kim);
        ogrenci1.lessonAdd(spor);
        ogrenci1.lessonAdd(java);
        ogrenci1.printLesson();
        System.out.println("-----------------------------");
        ogrenci2.lessonAdd(mat);
        ogrenci2.lessonAdd(fiz);
        ogrenci2.lessonAdd(kim);
        ogrenci2.lessonAdd(spor);
        ogrenci2.lessonAdd(java);
        ogrenci2.printLesson();




    }
}
