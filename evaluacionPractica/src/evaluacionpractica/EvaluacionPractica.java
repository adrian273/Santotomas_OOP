/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionpractica;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Adrian Verdugo
 * @version 1.0
 * @since 06-09-2017
 */
public class EvaluacionPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int numero, numeroAsiento;
        String empresa;
        
        /**
         * Avion 1
         */
        System.out.println("Numero de avion: ");
        numero = input.nextInt();
        System.out.println("Empresa: ");
        empresa = input.next();
        System.out.println("Numero de asientos: ");
        numeroAsiento = input.nextInt();
        System.out.println("--------------------");
        
        Avion a = new Avion(numero, empresa, numeroAsiento);
        
        a.embarcar(random.nextInt(numeroAsiento));
        a.despejar(random.nextInt(1000)); // distancia de avion
        a.setLitroBencina(random.nextInt(1250)); // litro de bencina
        System.out.println(a.aterrizar()); // aterrizar 
        a.desembarcar(random.nextInt(a.getPasajero()));
        
        a.embarcar(random.nextInt(numeroAsiento));
        a.despejar(random.nextInt(1000));
        a.setLitroBencina(random.nextInt(1250));
        System.out.println(a.aterrizar()); // aterrizar 
     
        a.desembarcar(random.nextInt(numeroAsiento));
        
        
        System.out.println("Pasajeros Totales: " + a.getPasajero());
        System.out.println("Total Distancia: " + a.totalDespejar() + "Km");
        System.out.println("Total Bencina utilizada: " + a.getLitroBencina() + "Lt");
        System.out.println("---------------------------------------");
        
        
        
        /**
         * Avion 2
         */
        System.out.println("Numero de avion: ");
        numero = input.nextInt();
        System.out.println("Empresa: ");
        empresa = input.next();
        System.out.println("Numero de asientos: ");
        numeroAsiento = input.nextInt();
        System.out.println("--------------------");
        
        Avion a1 = new Avion(numero, empresa, numeroAsiento);
        
        a1.embarcar(random.nextInt(numeroAsiento));
        a1.despejar(random.nextInt(1000)); // distancia de avion
        a1.setLitroBencina(random.nextInt(1250)); // litro de bencina
        System.out.println(a.aterrizar()); // aterrizar 
        a1.desembarcar(random.nextInt(a.getPasajero()));
        
        a1.embarcar(random.nextInt(numeroAsiento));
        a1.despejar(random.nextInt(1000));
        a1.setLitroBencina(random.nextInt(1250));
        System.out.println(a.aterrizar()); // aterrizar 
     
        a1.desembarcar(random.nextInt(numeroAsiento));
        
        
        System.out.println("Pasajeros Totales: " + a1.getPasajero());
        System.out.println("Total Distancia: " + a1.totalDespejar() + "Km");
        System.out.println("Total Bencina utilizada: " + a1.getLitroBencina() + "Lt");
        System.out.println("---------------------------------------");
        
        /**
         * Avion 3
         */
        System.out.println("Numero de avion: ");
        numero = input.nextInt();
        System.out.println("Empresa: ");
        empresa = input.next();
        System.out.println("Numero de asientos: ");
        numeroAsiento = input.nextInt();
        System.out.println("--------------------");
        
        Avion a2 = new Avion(numero, empresa, numeroAsiento);
        
        a2.embarcar(random.nextInt(numeroAsiento));
        a2.despejar(random.nextInt(1000)); // distancia de avion
        a2.setLitroBencina(random.nextInt(1250)); // litro de bencina
        System.out.println(a.aterrizar()); // aterrizar 
        a2.desembarcar(random.nextInt(a.getPasajero()));
        
        a2.embarcar(random.nextInt(numeroAsiento));
        a2.despejar(random.nextInt(1000));
        a2.setLitroBencina(random.nextInt(1250));
        System.out.println(a.aterrizar()); // aterrizar 
     
        a2.desembarcar(random.nextInt(numeroAsiento));
        
        
        System.out.println("Pasajeros Totales: " + a2.getPasajero());
        System.out.println("Total Distancia: " + a2.totalDespejar() + "Km");
        System.out.println("Total Bencina utilizada: " + a2.getLitroBencina() + "Lt");
        System.out.println("---------------------------------------");
    }
    
}
