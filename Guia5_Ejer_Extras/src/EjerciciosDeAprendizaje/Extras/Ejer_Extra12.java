/**
@Ejercicio 12
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */

package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Ejer_Extra12 {
 /**
   * @param args the command line arguments
   */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1=0, num2=0, num3=0;       
        String letraE="E";
        do {
            //Muestra el contador siempre y cuando una de las variables no sea un 3
            if (num3 != 3 && num2 != 3 && num1 != 3) {
                System.out.println(num1 +"-"+ num2 +"-"+ num3);
            }   
            //La variable sigue sumando hasta llegar a ser más que 8
            if (num3 <= 8) {
                num3++;     
                //En caso de que la variable num3 sea igual a 3. La reemplaza por pantalla por la variable String "letraE" 
                if (num3 == 3) {          
                    System.out.println(num1 +"-"+ num2 +"-"+ letraE);
                } 
            } else 
                //Una vez que "num3" llega a su maximo (9). El contador empieza desde cero con la variable "num2".
                if (num2 <= 8) {
                    num2++;  
                    //Se repite el proceso en caso de que la variable "num2" sea igual a 3.
                    if (num2 == 3) {
                         System.out.println(num1 +"-"+ letraE+"-"+ letraE);
                }
            } else 
                    //Cuando "num2" llega a su maximo (9). Empieza a contar la variable "num1". Repitiendo todo el proceso.
                    if (num1 <= 9) {
                        num1++;
                        if (num1 == 3) {       
                             System.out.println(letraE +"-"+ letraE +"-"+ letraE);
                } 
            } 
        } while ( (num1 != 10) && (num2 != 10) && (num3 != 10) ); //Una vez todas las variables sean igual a 9. Se sale del bucle "Do-While" y se finaliza el programa.
        
        }    
}