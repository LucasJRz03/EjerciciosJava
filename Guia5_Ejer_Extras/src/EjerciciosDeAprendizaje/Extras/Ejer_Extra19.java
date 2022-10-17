/**
 @Ejercicio 19
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
elementos).
 */

package EjerciciosDeAprendizaje.Extras;

import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("De un tamaño a los 2 vectores");
    //Se da un tamaño a los 2 vectores
        int tamaño = leer.nextInt();
        int[] vector1 = new int [tamaño];
        int[] vector2 = new int [tamaño];
    //Se le da valores al vector1     
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Asignar valor a vector1 en posicion "+(i+1) );
            vector1[i] = leer.nextInt();
        }
    //Se le da valores al vector2 
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Asignar valor a vector2 en posicion "+(i+1) );
            vector2[i] = leer.nextInt();
        }
        System.out.println("-----------------------------------");
        
    //Muestra en las posiciones en la que los valores sean iguales o diferentes
    boolean vof = true;
        for (int i = 0; i < tamaño; i++) {
              if (vector1[i] != vector2[i]) {
              //Si resulta que hay diferencias en "x" posicion del vector, el programa finaliza. 
                System.out.println("En posicion "+(i+1) );
                System.out.println("-Hay diferencias. Cerrando programa");
                vof = false;
                break;
              }
            }
        if (vof == true) {
                System.out.println("Los valores de ambos vectores son iguales");    
        }   
    }    
}
