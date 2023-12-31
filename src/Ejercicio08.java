import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        /*
        * Pide al usuario un número entre 0
        * y 20, luego verifica si está presente
        * en el siguiente array [13, 11, 2, 4,
        * 8, 3, 5,7]
        * */

        Scanner scanner = new Scanner(System.in);
        int [] numeros = {13, 11, 2, 4, 8, 3, 5,7};

        int search = 0;

        do {
            System.out.print("Ingresa el valor a buscar: ");
            search = scanner.nextInt();
        } while (!(search >= 0 && search <= 20));

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == search){
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            System.out.println("Está presente");
        }else{
            System.out.println("No está presente");
        }
    }
}
