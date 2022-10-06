/**
@Ejercicio 19
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa)
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] Matriz;
        //El usuario ingresa el tamaño de la Matriz ( NxN ).
        System.out.println("Ingrese la dimension de su Matriz");
        int dimension = leer.nextInt();
        //Si el usuario ingresa un valor menor a Dos entonces entrara al bucle While hasta que ingrese un numero mayor a Uno.
         while (dimension <= 1) {
             System.out.println("No es valido. Ingrese valores mayores a 1");
             dimension = leer.nextInt();
         }
         //La Matriz toma el valor ingresado por el usuario.
         Matriz = new int[dimension][dimension];
         
         //EL usuario ingresa los valores para cada posicicion de la Matriz. 
         System.out.println("Ahora ingrese valores para cada posicion en la Matriz");
           for (int i = 0; i < Matriz.length; i++) {
               for (int j = 0; j < Matriz.length; j++) {
                   System.out.println("De un valor a " +i +"."+j );
                     Matriz [i][j]= leer.nextInt();
               }
            
        }
         //Se muestra la Matriz con los valores ingresados por el Usuario.
        for (int[] Matriz1 : Matriz) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print("[" + Matriz1[j] + "]");
            }
            System.out.println("");
        } 
        //Verifica que los Valores(Numeros) asignados en la Matriz sean sus opuestos
        boolean validar = false;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if ( Matriz[i][j] != -Matriz[j][i] ) {
                     validar = true;
                }          
            }
        }
        //Muestra por pantalla una de las 2 opciones dependiendo de si cumple o no la condicion de que Validar sea igual a True. 
        if (validar) {
            System.out.println("No es Antisimetrica");
        }else {
            System.out.println("Es Antisimetrica");
        }
    }
    
}
