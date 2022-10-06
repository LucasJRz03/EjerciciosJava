/**
@Ejercicio 2
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla.
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Guia5_Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingresa tu nombre");
         String nombre = leer.nextLine();
         System.out.println("Su nombre es " + nombre);
    }
    
}
