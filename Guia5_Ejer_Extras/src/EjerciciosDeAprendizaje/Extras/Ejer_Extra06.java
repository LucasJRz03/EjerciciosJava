/**
@Ejercicio 6
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de personas");
        int cantidad = leer.nextInt();
        double[] personas = new double[cantidad];
        
        double altura; double suma=0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa la altura de persona "+(i+1));
            altura = leer.nextDouble();
            personas[i] = altura;
            suma = suma + altura;
        }
        int bajos=0; double suma2=0;
        for (int i = 0; i < cantidad; i++) {
            if (personas[i] < 1.6) {
                suma2= suma2 + personas[i];
                bajos++;    
            }     
        }
        double general=0, general2=0;
        general = suma / cantidad;
        general2 = suma2 / bajos;
        System.out.println("El promedio en general es= "+general);
        System.out.println("El promedio por debajo de 1.60 es= "+general2);
        
    }
    
}
