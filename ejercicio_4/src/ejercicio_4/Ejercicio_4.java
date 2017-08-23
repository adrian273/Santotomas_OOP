/*
 * Construir un programa que lea el tiempo de una maraton y 
 * deje de leer cuando sea 0.
 * Calcular:
 *  -> Numero de personas
 *  -> Tiempo Promedio
 */

package ejercicio_4;
import java.util.Scanner;

/**
 *
 * @author kdr
 * @version 1
 * @since 23-08-2017
 */
public class Ejercicio_4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number_person = 0;
        float time, time_total = 0, time_prom = 0;
        
        time = input.nextFloat();
        while(time != 0) {
            number_person += 1;
            time_total += time;
            time_prom = time_total / number_person;
            
            time = input.nextFloat();
        }
        
        System.out.println("Numero de personas: " + number_person);
        System.out.println("Tiempo promedio: " + time_prom);
        
    }
    
}
