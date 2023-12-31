import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        /*
        *  Pide el número de elementos de un array,
        *  el valor mínimo y el valor máximo,
        *  generar aleatoriamente los elementos
        *  de tipo double, imprimir el array
        *  generado, invierte el orden de los
        *  elementos e imprimir el resultado.
        *
        * RESOLVER!!!!!!!!!1
        */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamaño del array: ");
        int leng = scanner.nextInt();

        System.out.print("Valor MIN: ");
        double min = scanner.nextDouble();

        System.out.print("Valor MAX: ");
        double max = scanner.nextDouble();
        
        double [] numeros = new double[leng];

        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextDouble(min, max);
            System.out.println(numeros[i] + " ");
        }

        System.out.println("===============");

        double [] auxilla = new double[numeros.length];

        int poscicion = 0;
        for (int i = numeros.length-1; i >= 0 ; i--) {

            auxilla[poscicion] = numeros[i];
            System.out.println(auxilla[poscicion]);

            poscicion++;
        }



    }
}
