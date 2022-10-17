/**
@Ejercicio 9
Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 * @author lucas
 */
public class Ejer_Extra09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);  
        int dividendo; int divisor;
        int cociente = 0; int residuo = 0;
        System.out.println("Ingrese dos numeros");
        dividendo = leer.nextInt();
        divisor = leer.nextInt();
        
        while (dividendo <= 1 || divisor <= 1) {
            System.out.println("Solo numeros positivos mayores a 1");
            if ( dividendo <= 1) {
                dividendo = leer.nextInt();   
            } else 
                if (divisor <= 1) {
                    divisor = leer.nextInt();  
            }
        }
            int result=0;
        do {
         
            if (cociente==0) {
                result = dividendo - divisor;      
            } else {
                result = result - divisor;
            } 
            if (result < divisor) {
                residuo = result;    
            }
            cociente++;
        } while (result > divisor);
        
        System.out.println("Dado que " +result+ " es menor que " +divisor+ " Entonces: el residuo es " +residuo+ " y el cociente es " +cociente);
               
    }
    
}
