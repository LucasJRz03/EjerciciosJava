/**
@Ejercicio 17
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package EjerciciosDeAprendizaje;
import java.util.Random;
import java.util.Scanner;
/**
 * @author lucas
 */
public class Guia5_Ejer17 {
 /**
   * @param args the command line arguments
   */
    public static void main(String[] args) {
        //Random Otorga valores aleatorios que son guardados en la variable "r"
        Random r = new Random();
        Scanner leer = new Scanner(System.in);
        
  int vector[]; int maximo=99999; int minimo=0; 
  int UnDigito=0, DosDigitos=0, TresDigitos=0, CuatroDigitos=0, CincoDigitos=0;
        //El usuario le da un "tamaño" al vector.
     System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        vector = new int[tamaño];
        //Se le da valores aleatorios al vector entre un digito y cinco digitos.
        for (int i = 0; i < tamaño; i++) {
            //Vector[i] toma los valores aleatorios de la variable "r" para luego guardarlos.
            vector[i] = r.nextInt(maximo-minimo)+minimo;
        } 
        //Verifica los valores de los numeros en el Vector[i] 
        for (int i = 0; i < tamaño; i++) {
            int valor= vector[i];
            //Si el valor tiene menos de 10 digitos entonces es corrector y lo guarda en la variable UnDigito.
            if (valor<10){
                UnDigito = UnDigito + 1;
            } else {
                //Sino pasa a comprobar si el valor tiene 2 digitos. O sea 10 <= Valor && Valor < 100.
            if(valor<100){
                DosDigitos = DosDigitos + 1;
            } else {
                //Sino comprueba que el valor tenga 3 digitos. O sea 100 <= Valor && Valor < 1000.
            if(valor<1000){
                TresDigitos = TresDigitos + 1;    
            } else {
                //Sino comprueba que el valor tenga 4 digitos. O sea 1000 <= Valor && Valor < 10000.
            if(valor<10000){
                CuatroDigitos= CuatroDigitos + 1;
            } else {
                //Sino comprueba que el valor tenga 5 digitos. O sea 10000 <= Valor && Valor < 100000.
                if (valor<100000) {
                    CincoDigitos = CincoDigitos + 1;                    
            }
         }
        }
       }
      }  
     }    
        System.out.println("hay " + UnDigito + " valores que tienen un digito");          //Muestra la cantidad de valores que tengan cierto digitos.
            System.out.println("_______________________________________________");
         System.out.println("hay " + DosDigitos + " valores que tienen dos digito");   
            System.out.println("_______________________________________________");
        System.out.println("hay " + TresDigitos + " valores que tienen tres digito");
            System.out.println("_______________________________________________");
        System.out.println("hay " + CuatroDigitos + " valores que tienen cuatro digito");
            System.out.println("_______________________________________________");
        System.out.println("hay " + CincoDigitos + " valores que tienen cinco digito");    
        }    
}

    