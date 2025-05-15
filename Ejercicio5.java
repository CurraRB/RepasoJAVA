// Mostrar el número de días de un mes introduciendo el número del mes (1-12) y mostrando un mensaje valor no válido si no está en el rango 1-12 utilizando la sentencia switch.
package examentrimestre1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 12:");
        int mes = entrada.nextInt();

        int dias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                System.out.println("Número no válido");
                return;

        }

        System.out.println("El número de días de ese mes es: " + dias);

    }
}
