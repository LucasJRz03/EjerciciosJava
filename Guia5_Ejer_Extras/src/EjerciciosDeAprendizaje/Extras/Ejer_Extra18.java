/**
 @Ejercicio 18
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño 
N, con los valores ingresados por el usuario.
 */
package EjerciciosDeAprendizaje.Extras;

import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] vector = new int [tamaño];
        int suma = 0;
       
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Asignar un valor en la posicion "+(i+1));
            int numero = leer.nextInt();
            vector[i] = numero;  
            suma = suma + vector[i];
        }
        
        System.out.println("La suma de todos los valores es= "+suma);
    }
    
}
