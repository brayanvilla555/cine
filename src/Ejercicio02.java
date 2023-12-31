public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Dado el array: [8, 41, 12, 15, 2, 47,
        16, 49, 33, 15, 23, 6, 47, 11, 45].
        Calcular la suma de todos los elementos,
        el promedio e imprimir por consola.
        */

        int [] numero = {8, 41, 12, 15, 2, 47,
                16, 49, 33, 15, 23, 6, 47, 11, 45};

        int suma = 0;

        for (int i = 0; i < numero.length; i++) {
            suma += numero[i];
        }

        double promedio = suma / numero.length;

        System.out.println("La suma es: "+suma );
        System.out.println("El promedio es: "+promedio );


    }
}
