package thelasttour;

/**
 *
 * @author Adrian Verdugo
 */

public class Azafata extends Tripulacion {

    private int edad;
    
    /**
     * 
     * @param edad
     * @param rut
     * @param nombre
     * @param apellido
     * @param numeroTelefono 
     */
    public Azafata(int edad, String rut, String nombre, String apellido, int numeroTelefono) {
        super(rut, nombre, apellido, numeroTelefono);
        this.edad = edad;
    }
    
    /**
     * 
     * @param edad 
     */
    public Azafata() {
        
    }
    
    /**
     * 
     * @return edad de la azafata
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * 
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
