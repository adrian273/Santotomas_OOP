package negocio;
import datos.*;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Adrian Verdugo
 */
public class Vuelo {
    
    private Avion avion;
    private final HashMap<String, Pasajero> pasajero;
    static Scanner input;
    String rut, nombre, apellido, edad;
    /**
     * 
     * @param avion Clase Avion
     */
    public Vuelo(Avion avion) {
        this.avion = avion;
        this.pasajero = new HashMap<>();
        input = new Scanner(System.in);
    }
    
    public Vuelo() {
        this.pasajero = new HashMap<>();
        input = new Scanner(System.in);
    }
    
    /**
     * 
     * @return Datos del avion 
     */
    public Avion getAvion() {
        return avion;
    }
    
    /**
     * 
     * @param avion Datos del avion
     */
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    public void addPasajero() {
        rut = input.next();
        if(!pasajero.containsKey(rut))
            System.out.println("[ERROR] >> ya registrado");
        
        else {
            
        }
           
    }
    
    
    public void main() {
        boolean exit = false;
        String [] options = {"1. Agregar Tripulantes", "2. Agregar Pasajero" , "3. Eliminar Pasajero", "4. Salir"};
        
        while(!exit) {
            for(String o : options) {
                System.out.println(o);
            }
            int option = input.nextInt();
            switch(option) {
                case 1: 
                    String [] optionAddTripulante = {"1. Piloto", "2. Azafata"};
                    for(String o : optionAddTripulante)
                        System.out.println(o);
                    int op = input.nextInt();
                    switch(op) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                
                case 2:
                    this.addPasajero();
                    break;
                case 3:
                    break;
                case 4:
                    exit = true;
                    break;
            }
            
        }
    }
    
}
