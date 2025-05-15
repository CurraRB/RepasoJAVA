// Modifica el ejercicio anterior para pedir de nuevo el valor en el caso de que no sea válido en lugar de mostrar el mensaje.
package examentrimestre1;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int mes;
        do {
            System.out.println("Introduce el número del mes");
            mes = entrada.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Valor no válido. Introduce un nuevo número");
            }
        } while (mes < 1 || mes > 12);

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("Los días son: " + 31);
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("Los días son: " + 30);
        } else if (mes == 2) {
            System.out.println("Los días son: " + 28);
        } else if (mes < 1 || mes > 12) {
            System.out.println("Valor no válido");
        }

    }
}
