import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        /*
        *  Pide el número de elementos de un array,
        *  genera aleatoriamente los elementos de
        * tipo entero entre 1 y 20,imprimir el array
        *  generado, luego elimina los elementos
        *  duplicados y mostrar el resultado por consola.
        * */

        Scanner  scanner = new Scanner(System.in);
        System.out.print("Número de elementos;");
        int leng = scanner.nextInt();

        int [] numeros = new int[leng];

        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1, 21);
            System.out.print(numeros[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i+1; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    numeros[j] = 0;
                }
            }
            System.out.print(numeros[i] + " ");
        }

    }
}
