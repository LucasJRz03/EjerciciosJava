/**
@Ejercicio 11
Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class G5_Ej11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1, num2, opc;
       
    do {        
         System.out.println(" MENU ");
         System.out.println("1. Sumar");
         System.out.println("2. Restar"); 
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         
    //El Usuario elige la opcion para luego realizar cierta acción  
        
    System.out.print("Elija opción: "); 
        opc= leer.nextInt();
        switch(opc){
           case 1: 
               System.out.println("Ingrese 2 valores");
               num1 = leer.nextInt(); num2 = leer.nextInt(); 
               int suma = num1 + num2;
               System.out.println("La suma de los dos valores es " +suma);
               break;
           case 2:
               System.out.println("Ingrese 2 valores");
               num1 = leer.nextInt(); num2 = leer.nextInt(); 
               int resta = num1 - num2;
               System.out.println("La resta de los dos valores es " +resta);
               break;
           case 3:
                System.out.println("Ingrese 2 valores");
               num1 = leer.nextInt(); num2 = leer.nextInt(); 
               int multi = num1 * num2;
               System.out.println("La multiplicacion de los dos valores es " +multi);
               break;
           case 4:
               System.out.println("Ingrese 2 valores");
               num1 = leer.nextInt(); num2 = leer.nextInt(); 
               int div = num1 / num2;
               System.out.println("La division de los dos valores es " +div);
               break;
           case 5:
               System.out.println("¿Está seguro que desea salir del programa ? (S) para confirmar");
           String carac; 
               carac = leer.next();
               carac = carac.toUpperCase();
               System.out.println("Ingreso la letra "+carac);
               if ( "S".equals(carac)){ 
                   System.out.println("Saliendo");
               break;
              } else {
                   System.out.println("Continuar");
              opc = 1;
                }
        }         
        
    } while ( opc != 5);
       
       
    }
    
}
