import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {
    /*
    Multiplicación por Escalar:
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingresa un número: ");
        int number = scanner.nextInt();

        int [][] matrizUno = new int[4][4];
        int [][] matrizDos = new int[4][4];


        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                matrizUno[i][j] = random.nextInt(1,10);
                matrizDos[i][j] = matrizUno[i][j] * number;
            }
        }

        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                System.out.print(matrizUno[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=================");
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                System.out.print(matrizDos[i][j] + " ");
            }
            System.out.println();
        }


    }


}
