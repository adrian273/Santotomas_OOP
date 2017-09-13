
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 */

public class Empleado extends Persona {
    
    private long sueldo_base;
    
    /**
     * 
     * @param sueldo_base
     * @param rut
     * @param nombre
     * @param apellido
     * @param correo 
     */
    
    public Empleado(long sueldo_base, String rut, String nombre, String apellido, String correo) {
        super(rut, nombre, apellido, correo);
        this.sueldo_base = sueldo_base;
    }

    public long getSueldo_base() {
        return sueldo_base;
    }
    
    /**
     * 
     * @param sueldo_base 
     */
    public void setSueldo_base(long sueldo_base) {
        this.sueldo_base = sueldo_base;
    }
    
}
