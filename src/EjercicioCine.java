import java.util.Random;
import java.util.Scanner;

public class EjercicioCine {
    /*
    * Un cine desea gestionar las reservas
    * de sus asientos. Implementa un programa
    * en Java que representará los asientos
    * de una sala de cine, considerar que los
    *  asientos del cine no cambian.
    * Tenemos filas de asientos, y cada columna
    *  representa un asiento dentro de esa fila.
    *
    * El cine tiene un total de 10 filas y 15
    *  asientos por fila. Cada asiento puede
    * estar en uno de los siguientes estados:
    * -Libre: L
    * -Reservado: R
    * -Ocupado: O
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         char [][] asientos = new char[10][15];
         /*Crear un menú de los métodos creados*/

        int opcion = 0;

         do {
             System.out.println("===Menú===");
             System.out.println("1 para rellenar");
             System.out.println("2 para mostrar el mapa");
             System.out.println("3 para reservar");
             System.out.println("4 para cancelar la reserva");
             opcion = scanner.nextInt();

             switch (opcion){
                 case 1:
                     inicarSalaCine(asientos);
                     break;
                 case 2:
                     mapaDelCine(asientos);
                     break;
                 case 3:
                     reservarAsiento(asientos, scanner);
                     break;
                 case 4:
                     cancelarReserva(asientos,scanner);
                     break;
                 default:
                     System.out.println("Opción no válida");
             }

         }while ((opcion >= 1 && opcion <=4));


    }

    public static void inicarSalaCine(char [][] asientos){
        Random random = new Random();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length ; j++) {
                int fila = random.nextInt(0, 9);
                int columna = random.nextInt(0, 15);

                asientos[fila][columna] = 'L';

                if(asientos[i][j] != 'L'){
                    asientos[i][j] = 'R';
                }

            }
        }
    }

    public static void mapaDelCine(char [][] asientos){
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length ; j++) {
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    * Reservar Asiento: Permitir al usuario
    * seleccionar un asiento para reservarlo.
    *  Si el asiento ya está reservado u ocupado,
    *  mostrar un mensaje indicando que el
    *  asiento no está disponible.
     * */

    public static void reservarAsiento(char [][] asientos, Scanner scanner){
        System.out.print("Ingresa la fila: ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa el aciento: ");
        int numeroAsiento = scanner.nextInt();

        if(fila >= 1 && fila <= 10 && numeroAsiento >=1 && numeroAsiento <=15){
            if(asientos[fila-1][numeroAsiento-1] == 'L'){

                asientos[fila-1][numeroAsiento-1] = 'R';

            }else {
                System.out.println("ALERTA: Lugar en uso");
            }
        }else{
            System.out.println("ERROR, seleciona un lugar válido");
        }

    }

    private static void cancelarReserva(char[][] asientos, Scanner scanner){
        System.out.print("Ingresa la fila: ");
        int fila = scanner.nextInt();
        System.out.print("Ingresa el aciento: ");
        int numeroAsiento = scanner.nextInt();

        if(fila >= 1 && fila <= 10 && numeroAsiento >= 1 && numeroAsiento <= 15){
            if(asientos[fila-1][numeroAsiento-1] == 'R'){
                asientos[fila-1][numeroAsiento-1] = 'L';
            }else{
                System.out.println("Lugar no reservado");
            }
        }else{
            System.out.println("Ubicación inválida");
        }

    }














}
