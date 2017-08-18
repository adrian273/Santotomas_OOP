
package ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    /*
     * Leer un numero y que lea los 20 siguientes numeros impares.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // se inicia el objeto Scanner;
        System.out.println("Ingrese numero: ");
        
        int number = input.nextInt();
        int result_mod = number % 2;
        
        if(result_mod == 0){
            number -= 1;
        }
        
        System.out.println("Resultado: ");
        for (int a = 0; a < 20; a++) {
            number += 2;
            System.out.println(number); 
        }
    }
    
}
