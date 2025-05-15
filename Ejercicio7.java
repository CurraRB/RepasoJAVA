// Modifica la cadena " IES Francisco de Goya " (con un espacio en blanco al principio y otro al final) para que se muestre de estas 4 formas:
package examentrimestre1;

public class Ejercicio7 {

    public static void main(String[] args) {

        String cadena = " IES Francisco de Goya ";

        // Todas las letras en mayúsculas.
        //String cadenaModificada = cadena.trim().toUpperCase();
        //System.out.println(cadenaModificada);
        
        
        // Todas las letras en minúscula y con el carácter "_" en lugar de los espacios en blanco.
        //String cadenaModificada = cadena.trim().toLowerCase().replace(" ", "_");
        //System.out.println(cadenaModificada);
        
        
        //Como dirección de correo electrónico: todo en minúsculas, con puntos en lugar de espacios en blanco y terminado en "@murciaeduca.es".
        //String cadenaModificada = cadena.trim().toLowerCase().replace(" ", ".") + "@murciaeduca.es";
        //System.out.println(cadenaModificada);
    }

}
