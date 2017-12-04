package datos;

/**
 *
 * @author Adrian Verdugo
 */
public abstract class PersonalDeCabina extends Persona {
    
    private String nacionalidad;
    
    /**
     * 
     * @param nacionalidad del persona de la cabina
     * @param rut del persona de la cabina
     * @param nombre del persona de la cabina
     * @param apellido del persona de la cabina
     * @param edad del persona de la cabina
     */
    public PersonalDeCabina(String nacionalidad, String rut, String nombre, String apellido, int edad) {
        super(rut, nombre, apellido, edad);
        this.nacionalidad = nacionalidad;
    }
    
    /**
     * 
     * @param nacionalidad del personal de cabina 
     */
    public PersonalDeCabina(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    public PersonalDeCabina() {
    }
    
    /**
     * 
     * @return la nacionalidad del personal de cabina 
     */
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    /**
     * 
     * @param nacionalidad del personal de cabina
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}