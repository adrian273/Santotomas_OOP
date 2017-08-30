/*
 * Construir un programa que lea el tiempo de una maraton y 
 * deje de leer cuando sea 0.
 * Calcular:
 * v@1:
 *  -> Numero de personas.
 *  -> Tiempo Promedio.
 * v@2:
 *  -> Nombre de la persona con el tiempo menor.
 *  -> Cuantos se demoraron menos de 40 minutos.
 *  -> % de competidores que se demoraron mas de 45 minutos.
 */

package ejercicio_4;
import java.util.Scanner;

/**
 *
 * @author Adrian Verdugo
 * @version 2.0
 * @since 23-08-2017
 */
public class Ejercicio_4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // number_person = total participantes.
        // number_person_min = menos de 40 minutos.
        // number_person_max = mas de 45 minutos.
        int number_person = 0, number_person_min = 0,
            number_person_max = 0;
        
        final float TIME_MIN = 9999;
        
        float time, time_total = 0, 
              time_prom, number_person_max_por;
        
        String name, name_time_min = "";
        
        
        System.out.print( "Tiempo: " );
        time = input.nextFloat();
        
        while(time > 0) {
            System.out.print( "Nombre: " );
            name = input.next();
            
            
            if(time <= 40.0) {
                number_person_min += 1;
            } 
            else if (time > 45.0) {
                number_person_max += 1;
            }
            
            if(TIME_MIN > time){
                name_time_min = name;
            }
            
            number_person += 1;
            time_total += time;
            
            
            System.out.print( "Tiempo: " );
            time = input.nextFloat();
        }
        
        time_prom = time_total / number_person;
        number_person_max_por = number_person_max * 100 / number_person;
        
        System.out.println( "Numero de personas: " + number_person );
        System.out.println( "Tiempo promedio: " + time_prom );
        System.out.println( "Persona con el tiempo menor: " + name_time_min );
        System.out.println( "Numero de personas (menos de 40 min): " + number_person_min );
        System.out.println( "% de tiempo (mas de 45 min): " + number_person_max_por);
    }
    
}
