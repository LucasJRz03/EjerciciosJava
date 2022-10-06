/**
@Ejercicio 6
Crear un programa que dado un numero determine si es par o impar
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num % 2 == 0){
           System.out.println("Es par");
    }else {
            System.out.println("Es impar");
    }
  }   
}
