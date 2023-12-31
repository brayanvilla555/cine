import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {
    /*EJERCICIO 10
    * Genera un array de enteros de 50
    * elementos con valores entre 1 y 100,
    *  imprime el resultado. Luego pide al
    * usuario un índice y eliminar el
    * elemento en esa posición del array.
    *  Imprimir el resultado.
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1, 101);
            System.out.println(numeros[i]);
        }

        System.out.println("============");

        System.out.print("Ingresa el indice a eliminar: ");
        int indiceElimar = scanner.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if(indiceElimar == i){
                numeros[i] = 0;
            }
            System.out.println(numeros[i]);
        }
    }
}
