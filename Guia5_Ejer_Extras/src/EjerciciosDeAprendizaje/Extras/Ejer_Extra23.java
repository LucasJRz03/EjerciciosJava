/**
@Ejercicio 23
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida 
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que 
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras, 
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
por pantalla la sopa de letras creada. 
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random(). 
 */
package EjerciciosDeAprendizaje.Extras;
import java.util.Scanner;


/**
 *
 * @author lucas
 */
public class Ejer_Extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String matriz[][] = new String[20][20];
        String palabras[] = new String[5];
        int lug=0;
        int contador=0;
        String num;
        
        for (int i = 0; i < 5; i++) {
             System.out.println("Ingrese palabras de 3 a 5 caracteres");
            palabras[i] = leer.next();
            palabras[i] = palabras[i].toUpperCase();
         while (palabras[i].length() < 3 || palabras[i].length() > 5) {  
            System.out.println("Intente de nuevo");
            palabras[i] = leer.next();
            palabras[i] = palabras[i].toUpperCase();
         }   
        }
        for (int i = 0; i < 20; i++) {
           int random = (int) (Math.random() * 20);
            for (int j = 0; j < 20; j++) {
                if (matriz[random][j] == null) {
                    if (lug < 5) {
                        if (contador < palabras[lug].length()) {
                            matriz[random][j] = palabras[lug].substring(j,j+1);
                            contador++;
                        } else 
                           if (matriz[random][j] == null) {
                               int Darvalor = (int) (Math.floor(Math.random()*10));
                               num = Integer.toString(Darvalor);
                               matriz[random][j] = num;
                        }                     
                    }   
                } else {
                  lug--;
                       break;   
                }
            }
            lug++;
            contador= 0;
        }
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 20; j++){
                if (matriz [i][j] == null){
                   int random2 = (int) Math.floor(Math.random() * 10);
                        num = Integer.toString(random2);
                        matriz[i][j] = num; 
                }       
            }      
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("["+matriz[i][j]+ "] ");
            }
            System.out.println(" ");
        }
    }
    
}
