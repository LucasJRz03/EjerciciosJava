/**
 @Ejercicio 20
Crear una función que rellene un vector con números aleatorios, pasándole un arreglo por 
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package EjerciciosDeAprendizaje.Extras;

/**
 * @author lucas
 */
public class Ejer_Extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int[] vector = new int[5];
        
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random()*50+1);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion "+(i+1)+"="+vector[i]);
        }
        
    }
    
}
