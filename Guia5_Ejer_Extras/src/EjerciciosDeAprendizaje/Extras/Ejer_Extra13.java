/**
@Ejercicio 13
Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejer_Extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int escalera = leer.nextInt();
        int contar=0;
        for (int i = 1; i <= escalera; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);     
            }
            System.out.println("");     
        }
        
    }
    
}
