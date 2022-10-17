/**
@Ejercicio Extra 2
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Ejer_Extra02 {
/**
* @param args the command line arguments
*/
   public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        int A = 1; int B = 2; int C = 3; int D = 4; int aux = 0;
        System.out.println("\nLos valores de A, B, C y D son: ");
        System.out.println("\t"+A+", "+B+", "+C+", "+D);
        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;
        System.out.println("\nLos valores cambiados de A, B, C y D son: ");
        System.out.println("\t"+A+", "+B+", "+C+", "+D);
   }
}
