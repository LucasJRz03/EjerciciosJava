/**
 @Ejercicio 7 (Con bucle "While")
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
public class Ejer_Extra07_While{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        System.out.println("Ingresa la cantidad de numeros a calcular");
        int cantidad = leer.nextInt();
        int contar = 1; 
        int suma = 0;
        int valorMaximo = 0; int valorMinimo = 0;
        while (contar <= cantidad) {
            
            System.out.println(contar+". Ingrese el numero");
            int numero = leer.nextInt();
            
            suma = suma + numero;
            if (contar == 1) {
                valorMinimo = numero;
            }  
            if (valorMaximo < numero) {
                 valorMaximo = numero;   
            }else 
             if (valorMinimo > numero) {
                 valorMinimo = numero;    
            }
        contar++; 
        } 
        System.out.println("El promedio es "+suma/cantidad);
        System.out.println("El maximo es "+valorMaximo);
        System.out.println("El minimo es "+valorMinimo);
    }
   }
    