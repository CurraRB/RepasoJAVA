// Modificar uno de los dos apartados del ejercicio anterior para que se pidan los tres valores por consola.
package examentrimestre1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tres números enteros:");

        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        int suma = a + b + c;

        double promedio = (double) suma / 3;

        System.out.println("El promedio de esos números es " + promedio);

    }

}
