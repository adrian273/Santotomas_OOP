
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 */

public class Administrativo extends Empleado {
    
    private String nombre_depto;
    
    /**
     * 
     * @param nombre_depto
     * @param sueldo_base
     * @param rut
     * @param nombre
     * @param apellido
     * @param correo 
     */
    
    public Administrativo(String nombre_depto, long sueldo_base, String rut, String nombre, String apellido, String correo) {
        super(sueldo_base, rut, nombre, apellido, correo);
        this.nombre_depto = nombre_depto;
    }

    public String getNombre_depto() {
        return nombre_depto;
    }

    public void setNombre_depto(String nombre_depto) {
        this.nombre_depto = nombre_depto;
    }
    
}
