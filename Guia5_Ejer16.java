/**
 @Ejercicio 16
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package EjerciciosDeAprendizaje;
import java.util.Random;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner leer = new Scanner(System.in);  
        int [] vector; int tamaño = 0;
        int maximo=10; int minimo = 0;
     
        
        System.out.println("Ingrese el tamaño del arreglo");
        tamaño = leer.nextInt();
        
        vector  = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = r.nextInt(maximo-minimo)+minimo;
        }
        System.out.println("Se muestran los valores: ");
        for (int i = 0; i < tamaño; i++) {
            
            System.out.println(i +": " + vector[i]);
            
        }
        System.out.println("Ingrese el numero que desea buscar");
            int can=0; int posicion= 0;
           int buscaNum = leer.nextInt();
          for (int i = 0; i < tamaño; i++) {
              if (buscaNum == vector[i]){
                  System.out.println("Posicion " + i +": ");
                  can = can +1;
              }
              }   System.out.print("valores CORRECTOS encontrados: "+can);
            System.out.println(" ");
        }
    }
    

