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
        
        /**
         * Distancia al caminar.
         */
        p.walk(random.nextInt(1000));
        p.walk(random.nextInt(1000));
        p.walk(random.nextInt(1000));
        p.walk(random.nextInt(1000));
        
        p1.walk(random.nextInt(1000));
        p1.walk(random.nextInt(1000));
        p1.walk(random.nextInt(1000));
        p1.walk(random.nextInt(1000));
        
        p2.walk(random.nextInt(1000));
        p2.walk(random.nextInt(1000));
        p2.walk(random.nextInt(1000));
        p2.walk(random.nextInt(1000));
        
        /**
         * Gramos consumidos.
         */
        p.eat(random.nextInt(100));
        p.eat(random.nextInt(100));
        p.eat(random.nextInt(100));
        
        p1.eat(random.nextInt(100));
        p1.eat(random.nextInt(100));
        p1.eat(random.nextInt(100));
        
        p2.eat(random.nextInt(100));
        p2.eat(random.nextInt(100));
        p2.eat(random.nextInt(100));
        
        /**
         * @ Agua consumida en centimetros cubicos.
         */
        p.cubicCentimeter(random.nextInt(5000));
        p1.cubicCentimeter(random.nextInt(5000));
        p2.cubicCentimeter(random.nextInt(5000));
        
        /**
         * @ tiempo en llegar a la meta
         */
        p.timeGoal(random.nextInt(600));
        p1.timeGoal(random.nextInt(600));
        p2.timeGoal(random.nextInt(600));
        
        /**
         * persona 1
         */
        System.out.println(p.imprimir() + "-> velocidad: " +  p.speed());
        System.out.println("Distancia total recorrida: " + p.distanceTotal());
        System.out.println("Cantidad de gramos consumidos: " + p.gramTotal());
        System.out.println("Cantidad consumida de agua: " + p.ccTotal() + "cc");
        System.out.println("Tiempo en llegar a la meta: " + p.timeTotal());
        System.out.println("------------------------------------------------");
        /**
         * persona 2
         */
        System.out.println(p1.imprimir() + "-> velocidad: " + p1.speed());
        System.out.println("Distancia total recorrida: " + p1.distanceTotal());
        System.out.println("Cantidad de gramos consumidos: " + p1.gramTotal());
        System.out.println("Cantidad consumida de agua " + p1.ccTotal() + "cc");
        System.out.println("Tiempo en llegar a la meta: " + p.timeTotal());
        System.out.println("------------------------------------------------");
        /**
         * persona 3
         */
        System.out.println(p2.imprimir() + "-> velocidad: " + p2.speed());
        System.out.println("Distancia total recorrida: " + p2.distanceTotal());
        System.out.println("Cantidad de gramos consumidos: " + p2.gramTotal());
        System.out.println("Cantidad consumida de agua " + p2.ccTotal() + "cc");
        System.out.println("Tiempo en llegar a la meta: " + p.timeTotal());
        System.out.println("------------------------------------------------");
    }
    
}
