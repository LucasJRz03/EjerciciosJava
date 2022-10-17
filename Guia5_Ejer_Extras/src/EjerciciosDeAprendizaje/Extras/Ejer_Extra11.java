/**
 @Ejercicio 11
 Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados.
 */
package EjerciciosDeAprendizaje.Extras;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejer_Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);  
         System.out.println("Ingrese un numero. Se devolvera la cantidad de digitos que lo componen");
         int numero = leer.nextInt();
         int div=10;
         int result=0;
         int digito=0;
         do {
             result = numero/div;
             digito++;
             div = div * 10;  
        } while (result >= 1);
         
        System.out.println("El numero de digitos que lo componen es "+digito );   
    }
    
}
