/**
@Ejercicio 13
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *

 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class GUia5_Ejer13 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del cuadrado");
       int tamaño = leer.nextInt();
        if (tamaño >= 0 && tamaño<=100) {
            //Linea superior
            for (int a = 0; a < tamaño; a++) {
                System.out.print("* ");
            }
            System.out.println(" ");
            //Linea del centro
            for (int i = 0; i < tamaño-2; i++) {
                System.out.print("* ");
                for (int j = 0; j < tamaño-2; j++) {
                    System.out.print("  ");  
                }
                System.out.println("* ");
            }
            //Linea inferior
            for (int a = 0; a < tamaño; a++) {
                System.out.print("* ");
                
            }
        }
        
        System.out.println("  ");
 } 
}
