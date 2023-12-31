public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        * Dado el array: [156, 96, 165, 187, 270,
        *  287, 35, 332, 55, 322, 262, 344, 154,
        * 298, 234, 364, 297, 141, 76, 214].
        * Calcular el valor máximo y mínimo
        *  e imprimir por consola.
        */

        int [] numeros = {56, 96, 165, 187, 270,
                287, 35, 332, 55, 322, 262, 344,
                154, 298, 234, 364, 297, 141, 76,
                214};

        int maximo = numeros[0];
        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > maximo){
                maximo = numeros[i];
            }

            if(numeros[i] < minimo){
                minimo = numeros[i];
            }
        }

        System.out.println("Maximo: "+maximo);
        System.out.println("Mínimo: "+minimo);

    }
}
