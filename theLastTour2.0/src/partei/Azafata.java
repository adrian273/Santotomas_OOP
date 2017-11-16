
package partei;

/**
 *
 * @author user
 */
public class Azafata extends Tripulacion{
    private int edad;

    public Azafata() {
        
    }
    
    /**
     * 
     * @param edad de la azafata
     * @param Rut de la azafata
     * @param Nombre de la azafata
     * @param Apellido de la azafata
     * @param Telefono de la azafata
     */
    public Azafata(int edad, String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
        this.edad = edad;
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
     * @param edad de la azafata
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
