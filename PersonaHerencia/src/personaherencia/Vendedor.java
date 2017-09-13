
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 */

public class Vendedor extends Empleado {
    
    private long comision;
    
    /**
     * 
     * @param comision
     * @param sueldo_base
     * @param rut
     * @param nombre
     * @param apellido
     * @param correo 
     */
    
    public Vendedor(long comision, long sueldo_base, String rut, String nombre, String apellido, String correo) {
        super(sueldo_base, rut, nombre, apellido, correo);
        this.comision = comision;
    }
    
    public long sueldo() {
        return this.comision + this.getSueldo_base();
    }
    
}
