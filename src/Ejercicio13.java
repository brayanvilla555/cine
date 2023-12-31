import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
        * Pide el número de elementos de un array,
        * el valor mínimo y el valor máximo,
        * genera el array aleatoriamente, mostrar
        *  por consola. Seguidamente pide un número
        * al usuario y hallar dos elementos
        *  en el array generado cuya suma sea
        *  igual a ese número.
        */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Longitud del array: ");
        int longitud = scanner.nextInt();

        int[]numero = new int[longitud];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(1, 6);
            System.out.print(numero[i] + " ");
        }

        System.out.print("Ingresa el valor: ");
        int valor = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < numero.length; i++) {
            for (int j = i + 1; j < numero.length; j++) {
                if(numero[i] + numero[j] == valor){
                    encontrado = true;
                    break;
                }
            }
        }

        if(encontrado){
            System.out.println("Encontrados");
        }else {
            System.out.println("No encontrados");
        }

    }
}
