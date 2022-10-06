/**
@Ejercicio 7
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java. 
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Guia5_Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra correcta");
        String frase =leer.next();  
         frase = frase.toLowerCase();
       if( "eureka".equals(frase)){
           System.out.println("Correcto");
       }else {
           System.out.println("Incorrecto");
      }
     }
    }
    
