public class Ejercicio12 {
    public static void main(String[] args) {
        /*
        * Dados los array
        * [33, 36, 27, 19, 31, 44, 37, 49, 9, 10]
        *  y [39, 43, 26, 37, 33, 11, 47, 9, 36, 20].
        *  Hallar los elementos comunes entre los dos
        *  arrays y calcular el promedio.
        * */

        int[] arrayUno = {33, 36, 27, 19, 31, 44, 37, 49, 9, 10};
        int[] arrayDos = {39, 43, 26, 37, 33, 11, 47, 9, 36, 20};

        int suma = 0;
        int contador = 0;

        for (int i = 0; i < arrayUno.length; i++) {

            for (int j = 0; j < arrayDos.length; j++) {
                if(arrayUno[i] == arrayDos[j]){
                    System.out.println(arrayUno[i]);
                    suma += arrayUno[i];
                    contador++;
                }
            }
        }
        System.out.println("Suma: " + suma);

        contador = (contador <= 0) ? 1 : contador;

        double promedio = suma / contador;

        System.out.println("El promedio es: " + promedio);
    }
}
