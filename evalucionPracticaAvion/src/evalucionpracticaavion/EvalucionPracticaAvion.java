package evalucionpracticaavion;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Adrian Verdugo
 * @version 2.0
 */
public class EvalucionPracticaAvion {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        final int DISTANCIA = 500;
        
        int numero, numeroAsiento;
        String empresa;
        
        System.out.println("Numero: ");
        numero = input.nextInt();
        System.out.println("Empresa: ");
        empresa = input.next();
        System.out.println("Numero de asientos: ");
        numeroAsiento = input.nextInt();
        
        Avion a = new Avion(numero, empresa, numeroAsiento);
        System.out.println("------------------------------");
        System.out.println("|-----------------------------|");
        System.out.println("Numero de avion -> " + numero);
        System.out.println("|-----------------------------|");
        a.embarcar(random.nextInt(a.getNumeroAsiento()));
        System.out.println("Pasajeros subidos: " + a.getCantidadPasajero());
        a.setAsientoDisponible();
        
        
        a.despejar(random.nextInt(DISTANCIA));
        System.out.println("Recorrido: " + a.getDistancia() + "KM");
        
        a.aterrizar();
        a.desembarcar();
        a.setAsientoDisponibleBajada();
        System.out.println("Total Asientos disponibles: " + a.getAsientoDisponibleBajada());
        
        System.out.println("---------------------------------------------");
        
        a.embarcar(random.nextInt(a.getAsientoDisponibleBajada()));
        System.out.println("Pasajeros totales  subidos a bordo: " + a.getCantidadPasajero());
        a.setAsientoDisponible();
        
        
        a.despejar(random.nextInt(DISTANCIA));
        
        a.aterrizar();
        a.desembarcar();
        a.setAsientoDisponibleBajada();
        System.out.println("Total Asientos disponibles: " + a.getAsientoDisponibleBajada());
        
        System.out.println("---------------------------------------------");
        System.out.println("PAsajeros Totales en el recorrido: " + a.getCantidadPasajero());
        System.out.println("Distancia Recorrrida: " + a.getDistancia() + "KM");
        
        /**
         * Avion 2
         * 
         */
        
        System.out.println("Numero: ");
        numero = input.nextInt();
        System.out.println("Empresa: ");
        empresa = input.next();
        System.out.println("Numero de asientos: ");
        numeroAsiento = input.nextInt();
        
        Avion a1 = new Avion(numero, empresa, numeroAsiento);
        System.out.println("------------------------------");
        System.out.println("|-----------------------------|");
        System.out.println("Numero de avion -> " + numero);
        System.out.println("|-----------------------------|");
        a1.embarcar(random.nextInt(a1.getNumeroAsiento()));
        System.out.println("Pasajeros subidos: " + a1.getCantidadPasajero());
        a1.setAsientoDisponible();
        
        
        a1.despejar(random.nextInt(DISTANCIA));
        System.out.println("Recorrido: " + a1.getDistancia() + "KM");
        
        a1.aterrizar();
        a1.desembarcar();
        a1.setAsientoDisponibleBajada();
        System.out.println("Total Asientos disponibles: " + a1.getAsientoDisponibleBajada());
        
        System.out.println("---------------------------------------------");
        
        a1.embarcar(random.nextInt(a1.getAsientoDisponibleBajada()));
        System.out.println("Pasajeros totales  subidos a bordo: " + a1.getCantidadPasajero());
        a1.setAsientoDisponible();
        
        
        a1.despejar(random.nextInt(DISTANCIA));
        
        a1.aterrizar();
        a1.desembarcar();
        a1.setAsientoDisponibleBajada();
        System.out.println("Total Asientos disponibles: " + a1.getAsientoDisponibleBajada());
        
        System.out.println("---------------------------------------------");
        System.out.println("PAsajeros Totales en el recorrido: " + a1.getCantidadPasajero());
        System.out.println("Distancia Recorrrida: " + a1.getDistancia() + "KM");
        
        /**
         * Avion 3
         */
        
        System.out.println("Numero: ");
        numero = input.nextInt();
        System.out.println("Empresa: ");
        empresa = input.next();
        System.out.println("Numero de asientos: ");
        numeroAsiento = input.nextInt();
        
        Avion a2 = new Avion(numero, empresa, numeroAsiento);
        System.out.println("------------------------------");
        System.out.println("|-----------------------------|");
        System.out.println("Numero de avion -> " + numero);
        System.out.println("|-----------------------------|");
        a2.embarcar(random.nextInt(a2.getNumeroAsiento()));
        System.out.println("Pasajeros subidos: " + a2.getCantidadPasajero());
        a2.setAsientoDisponible();
        
        
        a2.despejar(random.nextInt(DISTANCIA));
        System.out.println("Recorrido: " + a2.getDistancia() + "KM");
        
        a2.aterrizar();
        a2.desembarcar();
        a2.setAsientoDisponibleBajada();
        System.out.println("Total Asientos disponibles: " + a2.getAsientoDisponibleBajada());
        
        System.out.println("---------------------------------------------");
        
        a2.embarcar(random.nextInt(a2.getAsientoDisponibleBajada()));
        System.out.println("Pasajeros totales  subidos a bordo: " + a2.getCantidadPasajero());
        a2.setAsientoDisponible();
        
        
        a2.despejar(random.nextInt(DISTANCIA));
        
        a2.aterrizar();
        a2.desembarcar();
        a2.setAsientoDisponibleBajada();
        System.out.println("Total Asientos disponibles: " + a2.getAsientoDisponibleBajada());
        
        System.out.println("---------------------------------------------");
        System.out.println("PAsajeros Totales en el recorrido: " + a2.getCantidadPasajero());
        System.out.println("Distancia Recorrrida: " + a2.getDistancia() + "KM");
    }
    
}
