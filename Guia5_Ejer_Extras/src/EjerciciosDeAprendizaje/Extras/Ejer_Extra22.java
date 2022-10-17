/**
@Ejercicio 22
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Random;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random dar = new Random();
        int max = 10; int min = 0;
      
        int tamaño = dar.nextInt(max-min)+min;
        int matriz[][] = new int[tamaño][tamaño];
        
        int suma=0;
        for (int i = 0; i < tamaño; i++) {   
            for (int j = 0; j < tamaño; j++) {
                matriz[i][j] = dar.nextInt(max-min)+min;
                suma = suma + matriz[i][j];
            }   
        }
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        
        System.out.println("La suma es="+suma);
    }
    
}
