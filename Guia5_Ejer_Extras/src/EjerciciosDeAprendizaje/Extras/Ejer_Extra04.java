/**
@Ejercicio Extra 4
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano.
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra04 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa un numero entre 1 y 10 para mostrar su equivalente en romano");
        int numero = leer.nextInt();
        while( numero < 1 || numero > 10) {
            System.out.println("Error!! Ingresa numeros entre 1 y 10");
            numero = leer.nextInt();   
        }
        switch (numero) {
            case 1:
                System.out.println("Su equivalente es= I");
                break;
            case 2:
                System.out.println("Su equivalente es= II");
                break;
            case 3:
                System.out.println("Su equivalente es= III");
                break;
            case 4:
                System.out.println("Su equivalente es= IV");
                break;
            case 5:
                System.out.println("Su equivalente es= V");
                break;
            case 6:
                System.out.println("Su equivalente es= VI");
                break;
            case 7:
                System.out.println("Su equivalente es= VII");
                break;
            case 8:
                System.out.println("Su equivalente es= VIII");
                break;
            case 9:
                System.out.println("Su equivalente es= IX");
                break;
            case 10:
                System.out.println("Su equivalente es= X");
                break;
        }
    }
    
}
