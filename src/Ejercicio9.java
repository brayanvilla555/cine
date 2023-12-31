import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numeros = new int[50];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1, 101);
            System.out.println(numeros[i]);
        }

        Scanner scanner = new Scanner(System.in);
        int ubicacion = 0;
        do {
            System.out.print("Ingres la ubicación del elemento a eliminar: ");
            ubicacion = scanner.nextInt();
        } while (!(ubicacion > 0 && ubicacion <= 50));

        System.out.println("=================");

        for (int i = 0; i < numeros.length; i++) {
            if((i+1) == ubicacion){
                numeros[i] = 0;
            }
            System.out.println(numeros[i]);
        }

    }
}
