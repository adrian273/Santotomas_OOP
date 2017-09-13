
package transporteherencia;

/**
 *
 * @author Adrian Verdugo
 * @since 12-09-2017
 * @version 1.0
 */
public class TransporteHerencia {

    public static void main(String[] args) {
        
        System.out.println("-----------------------Barco----------------------");
        Barco b = new Barco("Talca", "San Javier", 2, 3, 4);
        
        b.subirPasajero(10);
        System.out.println("Subida de pasajeros : " + b.getTotalSubirPasajero());
        
        b.bajarPasajero(5);
        System.out.println("Pasajero Bajado: " + b.getTotalBajarPasajero());
        System.out.println("Total Pasajeros: " + b.getTotalPasajero());
        
        b.subirPasajero(10);
        System.out.println("Subida de pasajeros : " + b.getTotalSubirPasajero());
        
        System.out.println("Total Pasajeros: " + b.getTotalPasajero());
        
        b.bajarPasajero(5);
        System.out.println("Pasajero Bajado: " + b.getTotalBajarPasajero());
        
        System.out.println("Total Pasajeros: " + b.getTotalPasajero());
        
        System.out.println("-------------------TREN----------------------------");
        Tren t = new Tren("Talca", "Valparaiso", 4, 5, 7);
        
        t.subirPasajero(35);
        System.out.println("Subida de pasajeros : " + t.getTotalSubirPasajero());
        
        t.bajarPasajero(5);
        System.out.println("Pasajero Bajado: " + t.getTotalBajarPasajero());
        System.out.println("Total Pasajeros: " + t.getTotalPasajero());
        
        t.subirPasajero(10);
        System.out.println("Subida de pasajeros : " + t.getTotalSubirPasajero());
        
        System.out.println("Total Pasajeros: " + t.getTotalPasajero());
        
        t.bajarPasajero(5);
        System.out.println("Pasajero Bajado: " + t.getTotalBajarPasajero());
        
        System.out.println("Total Pasajeros: " + t.getTotalPasajero());
    }
    
}
