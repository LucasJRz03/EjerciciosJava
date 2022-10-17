/**
@Ejercicio 16
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */

package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 *
 * @author users
 */
public class Ejer_Extra16 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion = "";
        boolean vof=true;
        System.out.println("Ingrese la cantidad de personas");
        int N = leer.nextInt();
        
        String[] nombres = new String[N];
        int[] edades = new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese el nombre de persona "+(i+1) );
            nombres[i] = leer.next();
            System.out.println("Ingrese la edad de persona "+(i+1) );
            edades[i] = leer.nextInt();
             
       }
        

        for (int i = 0; i < N; i++) {
            System.out.println("----------------------");
            System.out.println( (i+1)+".Persona=");
            System.out.println("Nombre="+ nombres[i] );
            System.out.println("Edad="+ edades[i] );  
            if (edades[i] >= 18) {
                System.out.println("Es mayor de edad");     
            } else {
                System.out.println("Es menor de edad");
            }
            System.out.println("-----------------------");
           
            do {
                System.out.println("Ver siguiente? Si/No");
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("Si") || opcion.equalsIgnoreCase("No") )  {
                    vof = false;
                }
            } while (vof == true);
            if (opcion.equalsIgnoreCase("No") ) {
                break;
            }
            }    
        }
           
                        
                       
       
            
       }
