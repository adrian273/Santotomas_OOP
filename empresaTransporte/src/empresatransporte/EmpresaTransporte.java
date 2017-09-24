
package empresatransporte;
import java.util.Random;
/**
 *
 * @author Adrian Verdugo
 * @since 14-09-2017
 * @version 1.0
 */
public class EmpresaTransporte {

    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        System.out.println("---------------------- Avion ---------------------");
        Avion avion = new Avion("kdr273", "Adrian Verdugo", 250, "Talca", "Santiago");
        avion.setLlenadoCombustible(100);
        
        avion.setSubidaPasajero(random.nextInt(avion.getCapacidadPasajero()));
        System.out.println("PAsajeros subidos: " + avion.getTotalSubidaPasajero());
        System.out.println("Pasajeros Totales: " + avion.getTotalPasajero());
        
        avion.setBajadaPasajero(random.nextInt(avion.getCapacidadPasajero()));
        System.out.println("Bajada de pasajero: " + avion.getTotalBajadaPasajero());
        System.out.println("Pasajeros Totales: " + avion.getTotalPasajero());
        
        avion.setSubidaPasajero(random.nextInt(avion.getCapacidadPasajero()));
        System.out.println("PAsajeros subidos: " + avion.getTotalSubidaPasajero());
        
        
        
        System.out.println("Pasajeros Totales: " + avion.getTotalPasajero());
    }
    
}
