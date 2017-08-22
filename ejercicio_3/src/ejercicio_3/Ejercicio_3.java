/*
 * Hacer un programa que lea y calcule el promedio.
 * -> Lea 20 Notas;
 * -> Que determine % azules;
 * -> Que determine cuantos rojos;
 */
package ejercicio_3;
import java.util.Scanner;
/**
 *
 * @author kdr
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float total_note = 0;
        float prom = 0, por_note_blue=0;
        int note_red=0, note_blue=0;
        for (int i = 1; i < 21; i++) {
            System.out.println("Ingrese nota " + i + ":");
            float note = input.nextFloat();
            
            if(note < 4.0) {
                note_red += 1;
            }
            else { 
                note_blue += 1;
            }
            total_note += note;
            prom = total_note / i;
            por_note_blue = note_blue * 100 / i;
        }
        System.out.println("El promedio es: " + prom);
        System.out.println("Porcentaje nota azul: " + por_note_blue +"%");
        System.out.println("Cantidad de notas rojas: " + note_red);
        
    }
    
}
