public class Ejercicio05 {
    public static void main(String[] args) {
        /*
        * Dado el array [346, 750, 164, 566, 930,
        *  724, 219, 785, 557, 937], duplica cada
        *  elemento y calcular la diferencia de
        * los promedios.
        * RESOLVER!!!!!!!!!!!!
        * */

        int [] numeros = {346, 750, 164, 566, 930,
                724, 219, 785, 557, 937};
        int [] numeroDuplicados = new int[numeros.length];

        int sumaNumeros = 0;
        int sumaDuplicados = 0;

        for (int i = 0; i < numeros.length; i++) {

            sumaNumeros += numeros[i];

            numeroDuplicados[i] = numeros[i] * 2;

            sumaDuplicados += numeroDuplicados[i];
        }


        double promedioNumeros = sumaNumeros / numeros.length;
        double promedioDuplicados = sumaDuplicados / numeroDuplicados.length;

        System.out.println("La diferencia es: "+ (double)(promedioDuplicados-promedioNumeros));


    }
}
