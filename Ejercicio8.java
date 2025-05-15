// El ejercicio del correo creando un método que contenga la funcionalidad principal pero manteniendo el mensaje que muestra el resultado en el método main.
package examentrimestre1;

public class Ejercicio8 {

    public static void main(String[] args) {

        String cadena = " IES Francisco de Goya ";

        String correo = generarCorreo(cadena);

        System.out.println(correo);

    }

    public static String generarCorreo(String cadena) {

        return cadena.trim().toLowerCase().replace(" ", ".") + "@murciaeduca.es";

    }

}
