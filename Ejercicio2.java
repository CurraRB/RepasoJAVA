// Calcular la suma de los números pares entre el 1 y el 20.
package examentrimestre1;

public class Ejercicio2 {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i < 20; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }

        }
        System.out.println("La suma de los números pares entre el 1 y el 20 es: " + suma);
    }

}
