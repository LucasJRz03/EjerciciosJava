/**
@Ejercicio 15
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente
 */
package EjerciciosDeAprendizaje;

/**
 * @author lucas
 */
public class Guia5_Ejer15 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeros[] = new int[101];
        
        for (int j = 100; j > 0; j--) {
            numeros[j]= j-1;
            System.out.println(j);
            
        }
    }
    }
     
