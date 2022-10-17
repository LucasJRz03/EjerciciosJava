/**
@Ejercicio 15
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int numero1 = leer.nextInt();
        int numero2 = leer.nextInt();
        int operacion=0;
        System.out.println("\nAhora eliga una de las siguientes opciones:");
        int opcion;
        do {
            System.out.println("\n1. Sumar"
                               +"\n2. Restar"
                               +"\n3. Multiplicar"
                               +"\n4. Dividir"
                               +"\n5. Salir");
            opcion = leer.nextInt();
            while (opcion > 5 || opcion < 1) {
                System.out.println("No es una opcion. Eliga de nuevo");
                opcion = leer.nextInt();
            }
            switch (opcion) {
                case 1: 
                    operacion = numero1 + numero2;
                    System.out.println("La suma es "+operacion);
                    break;
                case 2:
                    operacion = numero1 - numero2;
                    System.out.println("La resta es "+operacion);
                    break;
                case 3:
                    operacion = numero1 * numero2;
                    System.out.println("La multiplicacion es "+operacion);
                    break;
                case 4:
                    operacion = numero1 / numero2;
                    System.out.println("La division es "+operacion);
                    break;                  
            }   
        } while (opcion != 5);
        
        
    }
    
}
