// Mostrar el número de días de un mes introduciendo el número del mes (1-12) y mostrando un mensaje valor no válido si no está en el rango 1-12 sin utilizar la sentencia switch.
package examentrimestre1;

import java.util.Scanner;

public class Ejercicio5a {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número del mes");
        int mes = entrada.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("Los días son: " + 31);
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("Los días son: " + 30);
        } else if (mes == 2) {
            System.out.println("Los días son: " + 28);
        } else if (mes < 1 || mes > 12){
            System.out.println("Valor no válido");
        }
    }
}
