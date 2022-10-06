/**
@Ejercicio 20
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
Ejemplo: 
  2 7 6
  9 5 1 = 15
  4 3 8
  =    =
  15     15
*/
package EjerciciosDeAprendizaje;

import java.util.Scanner;

/**
 * @author lucas
 */
public class Guia5_Ejer20 {
/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Matriz [][] = new int [3][3];
        
// El usuario le asigna los valores a la Matriz
        for (int i = 0; i < 3; i++) {                                          
            for (int j = 0; j < 3; j++) {
              System.out.println("asigne un valor a la posicion " + i + "-" + j );
               int numero = leer.nextInt();
                Matriz[i][j] = numero;
                while (numero < 1 || numero > 9) {
                     System.out.println("Error! Ingrese valores entre el 1 a 9 ");
                     numero = leer.nextInt();
                     Matriz[i][j] = numero;
                }                
            }    
        }

// Suma las Filas de los valores en la Matriz  
        boolean vofF = true;
        for (int i = 0; i < Matriz.length; i++) {
            int Filas = 0;
            for (int j = 0; j < Matriz.length; j++) {
                  Filas += Matriz[i][j]; 
                 
            }
             for (int v = 0; v < 3; v ++) {
                      if (Filas == 15){
                          
                      }   else {
                        vofF = false;
                          
                      }
                  } 
            
            System.out.println("Se muestra la suma de la Fila " +i+ " es: " + Filas);  
        }
      
// Suma las Columnas de los valores en la Matriz   
       boolean vofC = true;
        for (int j = 0; j < 3; j++) {
            int Columnas = 0;
            for (int i = 0; i < 3; i++) {
                Columnas += Matriz[i][j];  
            }
            for (int v = 0; v < 3; v ++) {
                      if (Columnas == 15){
                          
                      }   else {
                        vofC = false;
                          
                      }
                  } 
          
                System.out.println("Se muestra la suma de la Columna " +j+ " es: " + Columnas);       
        }       
        
// Se define 2 vectores para cada Diagonal  
       int DiagonalPrimaria[] = new int [Matriz.length];
       int DiagonalSecundaria[] = new int [Matriz.length];
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                if (i == j ){
                DiagonalPrimaria [i] = Matriz[i][j];
                }
                if ((i+j)== Matriz.length-1) {
                     DiagonalSecundaria[i] = Matriz[i][j];
                }
            }     
        }
//Se suman los valores Diagonales que guarda la Matriz
            
            
/*Se utiliza For-Each ( Que hace lo mismo que el otro For
Pero reduce el código y no se usa el contador en el ciclo, el indice "i").
Este For-Each suma los valores del vector DiagonalPrimaria    
 */    
            int sumarP=0; boolean vofD1 = true;
            System.out.println("\nDiagonal Principal: ");
             for (int i: DiagonalPrimaria) {
                System.out.print("\t" + i);
                 sumarP += i; 
                 vofD1 = sumarP == 15;
             }  
//Muestra la Suma de los valores en la Diagonal Principal

            System.out.println(" ");
            System.out.println("La suma de la Diagonal Principal es: " +sumarP);
            
//El tipico For, este for suma los valores del vector DiagonalSecundaria

            int sumarS = 0; boolean vofD2 = true;
            System.out.println("Diagonal Secundaria: ");
             for (int i = 0; i < DiagonalSecundaria.length; i++) {
                System.out.print("\t" + DiagonalSecundaria[i]);
                 sumarS += DiagonalSecundaria[i]; 
                 vofD2 = sumarS == 15;
            }  
            System.out.println(" ");
            System.out.println("La suma de la Diagonal Secundaria es: " +sumarS);
            System.out.println("__________________________________________________");
           
//Verifica que la Matriz sea un cuadrado Magico

          if( vofC == true && vofF == true && vofD1 == true && vofD2 == true ) {
              System.out.println("Es un cuadrado magico");
          } else {
              System.out.println("No es un cuadrado magico");
          }
             
               
// Muestra la Matriz por pantalla

                 for (int i = 0; i < Matriz.length; i++) {
                   for (int j = 0; j < Matriz.length; j++) {
                    System.out.print("\t|" + i + "|" + j + "| ="+Matriz[i][j] );
                   }
                    System.out.println(" ");
                 }
             
                
              }  
            } 

   

