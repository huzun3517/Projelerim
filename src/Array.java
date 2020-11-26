import java.util.Arrays;

public class Array {

    public static void main(String[] args) {


        int[] b = {1,2,3,4,5,6};
        int[] c = {1,2,3,4,5,6};

        if (b == c){
            System.out.println("b ve c Eşitler");
        }
        else {
            System.out.println("b ve c Eşit değiller");
        }

        System.out.println("-----------------------------");

        int[] d = {7,8,9,10,11,12};
        int[] e = {7,8,9,10,11,12};

        if (Arrays.equals(d,e)){
            System.out.println("d ve e Elemanları eşit");
        }
        else {
            System.out.println("d ve e Elemanları Eşit değil");
        }

        }
}
