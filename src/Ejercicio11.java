import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {


    public static void main(String[] args) {
        /*
        * Genera dos array con valores aleatorios
        *  enteros, el primer array debe tener 10
        * elementos y el segundo 5. Imprimir los
        *  arrays generados y luego combina dos
        *  arrays en uno nuevo, imprimir
        * el nuevo array.
        * */

        int [] nuerosUno  = new int[10];
        int [] nuerosDos  = new int[5];

        rellenarArray(nuerosUno);
        mostrarArray(nuerosUno);

        System.out.println("============");

        rellenarArray(nuerosDos);
        mostrarArray(nuerosDos);

        System.out.println("============");
        unirArray(nuerosUno, nuerosDos);

    }

    private static void rellenarArray(int [] nueros){
        Random random = new Random();
        for (int i = 0; i < nueros.length; i++) {
           nueros[i] = random.nextInt(1, 101);
        }
    }

    private static void mostrarArray(int [] nueros){
        for (int i = 0; i < nueros.length; i++) {
            System.out.println(nueros[i]);
        }
    }

    private static int[] unirArray(int [] arrayUno, int [] arrayDos){
        int longitud = arrayUno.length + arrayDos.length;
        int auxillar = 0;
        int [] arrayUnidos = new int[longitud];
        for (int i = 0; i < arrayUnidos.length; i++) {
            if(i < arrayUno.length){
                arrayUnidos[i] = arrayUno[i];
            }else{
                arrayUnidos[i] = arrayDos[auxillar];
                auxillar++;
            }
            System.out.println(arrayUnidos[i]);
        }
        return arrayUnidos;
    }
}
