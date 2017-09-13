
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 */

public class Estudiante extends Persona {
    
    private int numero_matricula;
    
    /**
     * 
     * @param numero_matricula
     * @param rut
     * @param nombre
     * @param apellido
     * @param correo 
     */
    
    public Estudiante(int numero_matricula, String rut, String nombre, String apellido, String correo) {
        super(rut, nombre, apellido, correo);
        this.numero_matricula = numero_matricula;
    }

    public int getNumero_matricula() {
        return numero_matricula;
    }
    
    /**
     * 
     * @param numero_matricula 
     */
    public void setNumero_matricula(int numero_matricula) {
        this.numero_matricula = numero_matricula;
    }
    
}
