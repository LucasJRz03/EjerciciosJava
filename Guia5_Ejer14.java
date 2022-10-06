/**
@Ejercicio 14
Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe una cantidad en euros");
        String texto = leer.nextLine();
        double cantidad=Double.parseDouble(texto);
        System.out.println("Eliga una de las siguientes opciones a convertir: \nYenes \nLibras \ndolares");
         String moneda = leer.nextLine();
         moneda = moneda.toUpperCase();
        convertirMoneda(cantidad, moneda);
       } 
    
    public static void convertirMoneda (double cantidad, String moneda){
        double res=0;
 
        //El boolean sirve en caso de que alguien no introduzca un tipo de moneda valido.
        boolean correcto = true;
 
        //Se calcula la cantidad segun el tipo de moneda a transformar
        switch (moneda){
        case "LIBRAS":
            res=cantidad*0.86;
            break;
        case "DOLARES":
            res=cantidad*1.29;
            break;
        case "YENES":
            res=cantidad*129.852;
            break;
        default:
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
          //Solo si es correcto muestra el mensaje
        if (correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +res);
        }
        
           
 
    }
}

