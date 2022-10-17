/**
 @Ejercicio 7 (Con bucle "Do-while")
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”.
 */
package EjerciciosDeAprendizaje.Extras;

import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra07_DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        System.out.println("Ingresa la cantidad de numeros a calcular");
        int cantidad = leer.nextInt();
        int contar = cantidad;
        int suma = 0;
        int valorMaximo = 0; int valorMinimo = 0;
        do {
            
            System.out.println(contar+". Ingrese el numero");
            int numero = leer.nextInt();
                    
            if (suma == 0) {
                valorMinimo = numero;
            }  
            if (valorMaximo < numero) {
                 valorMaximo = numero;   
            }else 
             if (valorMinimo > numero) {
                 valorMinimo = numero;    
            }
            
            suma = suma + numero;
            contar--;
            
        } while (contar != 0);
        
        System.out.println("El promedio es "+suma/cantidad);
        System.out.println("El maximo es "+valorMaximo);
        System.out.println("El minimo es "+valorMinimo);
    }
   }