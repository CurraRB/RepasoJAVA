// Calcular el promedio de tres números utilizando un array.
package examentrimestre1;

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio de los números es " + promedio);

    }

}
