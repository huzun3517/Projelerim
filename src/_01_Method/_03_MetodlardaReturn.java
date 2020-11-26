package _01_Method;

public class _03_MetodlardaReturn {

    public static void main(String[] args) {

        int sum = toplama(1,2,3);
        System.out.println("Toplamları = " + sum);
        System.out.println("*********************");
        
        int sonuc = dortilecarp(ikiiletopla(ikiilecarp(8)));
        System.out.println("sonuc = " + sonuc);

        System.out.println("**********************");
        System.out.println(deneme(8));


    }
    public static int toplama(int num1, int num2, int num3) {

        int sum =0;
        sum = num1 + num2 + num3;
        return sum;
    }
    
    public static int ikiilecarp(int num) {
        return num * 2;
    }
    
    public static int ikiiletopla(int num) {
        return num + 2;
    }
    
    public static int dortilecarp(int num) {
        return num * 4;
    }

    public static int deneme(int num) {
        System.out.println("Çıktı veriliyor....");
        return num * 2; // return programda son fonksiyondur. sonrasında başka birşey yazılırsa java hata verir.
      //  System.out.println("Çıktı veriliyor....");

    }
}
