/**
@Ejercicio Extra 3
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejer_Extra03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Solo las vocales son CORRECTAS");
        String letra = leer.next();
        letra = letra.toUpperCase();
        while (letra.length() > 1) {
            System.out.println("Ingresaste más de una letra. Ingrese una vocal");
            letra = leer.next();
            letra = letra.toUpperCase();
        }
        if ("A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra)) {
            System.out.println("Es una vocal. Es correcto");      
        } else {
            System.out.println("No es una vocal. Es incorrecto");
        }
    }
    
}
