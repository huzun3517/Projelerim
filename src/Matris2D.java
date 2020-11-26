import java.util.Scanner;

public class Matris2D {

    public static void main(String[] args) {

        int[][]matris2 = new int[4][5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matris2.length ; i++) {

            for (int j = 0; j < matris2[i].length; j++) {

                System.out.print("Sayı gir: ");
                matris2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("*****************************");


        for (int i = 0; i < matris2.length ; i++) {

            for (int j = 0; j < matris2[i].length; j++) {

                System.out.print(matris2[i][j] + " ");

            }
            System.out.println("");
        }


    }
}
