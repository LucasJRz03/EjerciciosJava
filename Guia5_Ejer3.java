/**
@Ejercicio 3
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Guia5_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una frase");
         String frase = leer.nextLine();
         frase = frase.toUpperCase();
           System.out.println("^Se muestra la frase toda en Mayus^");
             System.out.println(frase);
         frase = frase.toLowerCase();
           System.out.println("^Se muestra la frase toda en Minus^");
             System.out.println(frase);
         
    }
    
}
