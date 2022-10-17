/**
@Ejercicio Extra 1
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Ejer_Extra01 {

  /**
   * @param args the command line arguments
  */
   public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
    int horas = 0; int dias = 0;
     System.out.println("Ingrese un tiempo en minutos");
      int minutos = leer.nextInt();
        while (minutos> 59) {
            if (minutos >= 1440) {
             dias += 1;
             minutos= minutos- 1440;
            } else {
              if (minutos >= 60) {
               horas += 1;
               minutos= minutos - 60;
              } 
            }
        }
        if (dias > 1){
       System.out.println("su equivalente es de "+dias+" días con "+horas+" horas");       
        } else {
            System.out.println("Su equivalente es de "+dias+ " dia con "+horas+ " horas");
        }
   }  
}
