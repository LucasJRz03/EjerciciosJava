/**
 @Ejercicio 21
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y 
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del 
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y 
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o 
igual al 7 de sus notas del curso.

 */
package EjerciciosDeAprendizaje.Extras;

import java.util.Scanner;
/**
 * @author lucas
 */
public class Ejer_Extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double alumnos[] = new double[3];
       int aprobados=0;
       int desaprobados=0;
       
        for (int i = 0; i < 3; i++) {
            System.out.println("Alumno"+(i+1)+": Ingrese la nota del Pimer trabajo practico");
            double Tp1 = leer.nextDouble();
            System.out.println("Alumno"+(i+1)+": Ingrese la nota del Segundo trabajo practico");
            double Tp2 = leer.nextDouble();
            System.out.println("Alumno"+(i+1)+": Ingrese la nota del Pirmer Integrador");
            double integrador = leer.nextDouble();
            System.out.println("Alumno"+(i+1)+": Ingrese la nota del Segundo Integrador");
            double integrador2 = leer.nextDouble();
            
            alumnos[i]= (Tp1*0.10) + (Tp2*0.15) + (integrador*0.25) + (integrador2*0.50);      
        }
        for (int i = 0; i < 3; i++) {
            if (alumnos[i] >= 7) {
                aprobados++; 
            } else {
                desaprobados++;
            }
        }  
            System.out.println("\nLos alumnos aprobados son "+aprobados+
                                "\nLos alumnos desaprobados son "+desaprobados);
    }
    
}
