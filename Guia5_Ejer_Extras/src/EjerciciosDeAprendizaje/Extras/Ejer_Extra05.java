/**
@Ejercicio 5
Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Ejer_Extra05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Diga a la clase que este asociado (A, B o C)");
        String socio = leer.next();
        while (!"A".equalsIgnoreCase(socio) && !"B".equalsIgnoreCase(socio) && !"C".equalsIgnoreCase(socio)) {
            System.out.println("Solo A, B o C");
            socio = leer.next();
        }
        System.out.println("Ingrese el costo del tratamiento");
                int costo = leer.nextInt();
                socio = socio.toUpperCase();
        switch (socio) {
            case "A":
                System.out.println("Descuento de 50%");
                 costo = (int) (costo * 0.5);
                 break;
            case "B":
                System.out.println("Descuento del 35%");
                costo = (int) (costo * 0.35);
                break;
            case "C":
                System.out.println("Sin descuento");
        }
        System.out.println("Su importe a pagar es de $"+costo);
    }
    
}
