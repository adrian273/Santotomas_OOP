/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kdr
 * @since 29-08-2017
 * @version 1.0
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo la instancia de Escanner para leer datos.
        Scanner input = new Scanner(System.in);
        // instancio random
        Random random = new Random();
        
        String rut, name, lastName;
        //int age, aceleration;
        //int num;
        
        /*System.out.println("Rut: ");
        rut = input.next();*/
        System.out.println("Nombre: ");
        name = input.next();
        System.out.println("Apellido: ");
        lastName = input.next();
        /*System.out.println("Edad: ");
        age = input.nextInt*/
        /*System.out.println("Aceleracion: ");
        aceleration = input.nextInt();*/
        // Creo la instancia persona y le paso sus valores.
        Persona p = new Persona(name, lastName);
               
        
        /*
        System.out.println("Rut: ");
        rut = input.next();*/
        System.out.println("Nombre: ");
        name = input.next();
        System.out.println("Apellido: ");
        lastName = input.next();
        /*System.out.println("Edad: ");
        age = input.nextInt();
        System.out.println("Aceleracion: ");
        aceleration = input.nextInt();*/
        Persona p1 = new Persona(name, lastName);
        
        
             
        /*System.out.println("Rut: ");
        rut = input.next();*/
        System.out.println("Nombre: ");
        name = input.next();
        System.out.println("Apellido: ");
        lastName = input.next();
        /*System.out.println("Edad: ");
        age = input.nextInt();
        System.out.println("Aceleracion: ");
        aceleration = input.nextInt();*/
        Persona p2 = new Persona(name, lastName);
        
        /**
         * pasando numeros aleatorios al metodo correr
         */
        p.correr(random.nextInt(10) + 1);
        p.correr(random.nextInt(10) + 1);
        p1.correr(random.nextInt(10) + 1);
        p1.correr(random.nextInt(10) + 1);
        p2.correr(random.nextInt(10) + 1);
        p2.correr(random.nextInt(10) + 1);
        
        
        System.out.println(p.imprimir() + "-> velocidad: " +  p.speed());
        System.out.println(p1.imprimir() + "-> velocidad: " + p1.speed());
        System.out.println(p2.imprimir() + "-> velocidad: " + p2.speed());
    }
    
}
