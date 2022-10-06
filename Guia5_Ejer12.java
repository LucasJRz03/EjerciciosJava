/**
@Ejercicio 12
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals()
 */
package EjerciciosDeAprendizaje;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer12 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
           String FDE; 
           int correctos=0; 
           int errores=0;
           //Se pide el formato correcto
          do { 
               System.out.println("Ingrese los formato correctos");
               //El usuario ingresa el formato
               FDE = leer.nextLine();
               //Se trasforma el formato ingresado por el usuario a Todo en Mayúscula 
                 FDE= FDE.toUpperCase();
                 //Se verifica Si el formato ingresado tiene menos o más de 5 carácteres
                 if( FDE.length() < 6 ) {
                     //La variable "caracter" toma el primer valor del formato ingresado
                       String caracter = FDE.substring(0,1);
                        //Se verfica que el primer caracter ingresado sea igual a "X" 
                    if("X".equals(caracter)) { 
                         //Ahora la variable "caracter" toma el valor del ultimo carácter del formato ingresado 
                          caracter = FDE.substring(4,5);
                          //Se verifica que el ultimo carácter ingresado sea igual a "O" 
                        if ("O".equals(caracter)) {
                            //Si las condiciones se cumplen, se suma al contador "correctos" y se repite el proceso.
                           correctos = correctos + 1;
                          
                        } 
                    } else if(!"&&&&&".equals(FDE)) {
                     errores = errores + 1;
                    }
              
                } else {
                       System.out.println("No ingreso el formato correcto");
                       break;
                }
               
        } while (!"&&&&&".equals(FDE));
 
         System.out.println("La cantidad correcta Ingresadas son: " +correctos);
         System.out.println("--------------------------------------------");
         System.out.println("La cantidad de errores son: " +errores);
    }
    }
    

