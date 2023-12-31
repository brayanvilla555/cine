import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Ingresa la longitud de un array y
        genera sus elementos aleatoriamente
        con números enteros entre 20 y 50 e
        imprimir su contenido.
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del array: ");
        int longitudArray = scanner.nextInt();

        Random random = new Random();
        int [] numeros = new int[longitudArray];


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(20, 51);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
