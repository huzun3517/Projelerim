package Calismalar;

public class Calisma {

    public static void main(String[] args) {

        String[] array = {"Elma","Armut","Kiraz"};

        for (String s: array){
            System.out.println(s);
        }

        int[] array2 = {1,2,3,4,5,6,7};
        System.out.println("-------------------");

        for (int i : array2) {
            System.out.println(i);
        }

        System.out.println("----------------");

        Deneme[] array3 = {new Deneme("Ömer"),new Deneme("Faruk"),new Deneme("Uzun")};

        for (Deneme d: array3){
            d.yaz();
        }


    }
}
