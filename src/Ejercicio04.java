import java.util.Random;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        *Genera un vector aleatorio de enteros,
        * cuya longitud sea de 50 elementos,
        * el valor mínimo sea 25 y el valor
        * máximo 70, luego cuenta el número de
        * elementos pares e impares. Imprimir
        * el resultado por consola
        */

        Random random = new Random();
        int [] numeros = new int[50];

        int contadorPar = 0;
        String pares ="";
        int contadorImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(25, 71);

            //System.out.println(numeros[i]);

            if(numeros[i] % 2 == 0){
                contadorPar ++;
            }else {
                contadorImpar ++;
            }

        }

        System.out.println("Cantidad pares: "+ contadorPar);
        System.out.println("Cantidad impares: "+ contadorImpar);
    }
}
