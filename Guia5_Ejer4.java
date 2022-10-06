/**
@Ejercicio 4
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
public class Guia5_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados centigrados");
        int grados = leer.nextInt();
        double F;
        F = 32 + (9 * grados / 5);
        System.out.println("Su equivalente en grados Fahrenheit es " + F);
    }
    
}
