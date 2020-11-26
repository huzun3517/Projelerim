package _01_Method;

public class _05_KodBloklarındakiLokalDegiskenler {

    public static void main(String[] args) {

        int a = 4;
        String yazdir = "Merhaba";

        if (a < 10) {
            System.out.println(yazdir);
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }

    //    System.out.println(i); --> i lokal değişken. for dışında kullanamayız.

        int j = 1;
        while (j < 10) {
            if (j % 2 == 0) {
                String yaz = "Çift";
                System.out.println(yaz);
            }
     //       System.out.println(yaz); --> yaz lokal değişken
            j++;
        }

        toplama(10,20,30);
      //  System.out.println(deneme); --> deneme sadece methodda tanımlı. lokal değişken




    }



    public static void toplama(int num1, int num2 ,int num3) {
        System.out.println("Toplama Sonucu = " + (num1 + num2 + num3));
        int deneme = 10;
    }




}
