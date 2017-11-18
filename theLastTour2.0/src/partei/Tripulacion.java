
package partei;

/**
 *
 * @author user
 */
public abstract class Tripulacion extends Persona{

    public Tripulacion() {
    }
    
    /**
     * 
     * @param Rut de la persona
     * @param Nombre de la persona
     * @param Apellido de la persona 
     * @param Telefono de la persona
     */
    public Tripulacion(String Rut, String Nombre, String Apellido, String Telefono) {
        super(Rut, Nombre, Apellido, Telefono);
    }
      
}
