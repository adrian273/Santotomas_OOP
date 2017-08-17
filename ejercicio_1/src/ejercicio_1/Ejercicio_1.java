/*
 * Mostrar los numeros del 1 al 20 numeros pares [1-20].
 */
package ejercicio_1;

/**
 *
 * @author kdr
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i < 21; i++){
            int result = i % 2;
            if(result == 0) {
                System.out.println(i);
            }
        }
    }
    
}
