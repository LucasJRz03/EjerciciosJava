/**
 @Ejercicio 5
Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Guia5_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int numero = leer.nextInt();
         int suma = numero + numero;
         int triple = numero * 3;
         double raiz = Math.sqrt(numero);
         System.out.println("La suma es: " +suma+ " el triple es de: " +triple+ " su raiz es de: " +raiz);
    }
    
}
