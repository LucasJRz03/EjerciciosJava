/**
@Ejercicio 14
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        int cantidad = leer.nextInt();
        int count=0;
        int media = 0;
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la cantidad de hijos en la familia "+(i+1) );
            int hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo "+(j+1)+" de la familia "+(i+1) );
                int edad = leer.nextInt();
                media += edad;
                count++;
            }
        }
        
      media = media / count;
      System.out.println("La media de la edad de los hijos de todas las familias es "+ media);
    } 
}
