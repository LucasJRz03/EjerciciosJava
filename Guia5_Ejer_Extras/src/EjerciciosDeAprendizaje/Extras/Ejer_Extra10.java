/**
@Ejercicio 10
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java.
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Random;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Ejer_Extra10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        Random dar = new Random();
        int maximo = 10; int minimo = 0;
        
        int numero1 = dar.nextInt(maximo-minimo)-minimo;
        int numero2  = dar.nextInt(maximo-minimo)-minimo;
        int multiplicacion = numero1 * numero2;
        
        System.out.println("Adivine el resultado de la multiplicacion");
        int opcion = leer.nextInt();
        
        while (opcion != multiplicacion) {
            System.out.println("Incorrecto. Intente de nuevo");
            opcion = leer.nextInt();
        }
        
        System.out.println("Correcto. El resultado era " +multiplicacion);
        
    }
    
}
