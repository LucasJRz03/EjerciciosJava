/**
 @Ejercicio 8
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejer_Extra08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        int numero;
        int cantidad=0;
        int pares=0;
        int impares=0;
        int suma=0;
        
        do {
            
            System.out.println("Ingrese numeros que no sean multiplo de cinco");
            numero = leer.nextInt();
          while (numero < 0) {
              System.out.println("Error! Ingrese numeros mayor a 0");
              numero = leer.nextInt();
          }

            suma = suma + numero;
            if (numero %2 == 0) {
                pares++;     
            } else {
                impares++;
            }
            cantidad++;
        } while (numero %5 !=0);
        
        System.out.println("Total de numeros= "+cantidad);
        System.out.println("Pares= "+pares);
        System.out.println("Impares= "+impares);
        System.out.println("Suma total= "+suma);
    }
    
}
