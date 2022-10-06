/**
@Ejercicio 10
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
     int num1;
        System.out.println("Ingrese el valor limite positivo");
        int limite = leer.nextInt();
       
        for (int i = 0; i < limite; i++) {
            System.out.print("ingrese: "); 
            num1 = leer.nextInt();
            i = i + num1;
    } System.out.println("supero el limite");
  }  
}
