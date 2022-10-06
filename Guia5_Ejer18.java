/**
@Ejercicio 18
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene 
cambiando sus filas por columnas (o viceversa).
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
import java.util.Random;
/**
 * @author lucas
 */
public class Guia5_Ejer18 {
/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         Random r = new Random(); int maximo=9; int minimo = 0;
         int[][] Matriz= new int[4][4];
         
         //Se le asigna valores aleatorios a la matriz entre 0 (como minimo) y 9 (como maximo).
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
               Matriz[i][j] = r.nextInt(maximo-minimo)+minimo;
        } 
        }
        //Se muestra la Matriz
        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //Se muestra la Matriz con los valores predeterminados. 
                System.out.print(" |" +i +"."+j+ ":[" +Matriz[i][j]+"]");
                
        }
        System.out.println("");   
        }
        //Se muestra la Matriz Traspuesta
        System.out.println("Matriz Traspuesta: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //Las columnas se convierten en filas y las filas en columnas.
                System.out.print("| " +j+ "."+i+ ":[" +Matriz[j][i]+ "]");
                
        }
        System.out.println("");
        }
        
 }  
}
