package javaone;
import negocio.Vuelo;
import negocio.Avion;
import negocio.Servicio;
import java.util.Scanner;
/**
 *
 * @author Adrian Verdugo
 * @since 28-10-2017
 * @version 0.1
 */
public class JavaOne {

    public static void main(String[] args) {
        /*Vuelo vuelo = new Vuelo();
        vuelo.main();*/
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        String marca, modelo, audifono, juego;
        int capacidadPasajero;
        System.out.println("Agregar vuelo");
        System.out.println("Agregar Avion al vuelo");
        System.out.println("Marca:");
        marca = input.next();
        System.out.println("Modelo:");
        modelo = input.next();
        System.out.println("Capacidad de pasajeros");
        capacidadPasajero = input.nextInt();
        Avion avion = new Avion(marca, modelo, capacidadPasajero);
            
        System.out.println("Tiene Audifonos");
        audifono = input.next();
        System.out.println("Juegos");
        juego = input.next();
        Servicio service = new Servicio(audifono, juego);
            
        Vuelo v = new Vuelo(avion, service);
       
        System.out.println("Marca:");
        marca = input.next();
        System.out.println("Modelo:");
        modelo = input.next();
        System.out.println("Capacidad de pasajeros");
        capacidadPasajero = input.nextInt();
        Avion avion2 = new Avion(marca, modelo, capacidadPasajero);
            
        System.out.println("Tiene Audifonos");
        audifono = input.next();
        System.out.println("Juegos");
        juego = input.next();
        Servicio service2 = new Servicio(audifono, juego);
            
        Vuelo v2 = new Vuelo(avion2, service2);
        
        System.out.println("Marca:");
        marca = input.next();
        System.out.println("Modelo:");
        modelo = input.next();
        System.out.println("Capacidad de pasajeros");
        capacidadPasajero = input.nextInt();
        Avion avion3 = new Avion(marca, modelo, capacidadPasajero);
            
        System.out.println("Tiene Audifonos");
        audifono = input.next();
        System.out.println("Juegos");
        juego = input.next();
        Servicio service3 = new Servicio(audifono, juego);
            
        Vuelo v3 = new Vuelo(avion3, service3);
        
        System.out.println(v.print());
        System.out.println(v2.print());
        System.out.println(v3.print());
    }
    
}
