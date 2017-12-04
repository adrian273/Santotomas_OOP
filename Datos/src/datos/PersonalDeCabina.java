package datos;

/**
 *
 * @author Adrian Verdugo
 */
public abstract class PersonalDeCabina extends Persona {
    
    private String nacionalidad;

    public PersonalDeCabina(String nacionalidad, String rut, String nombre, String apellido, int edad) {
        super(rut, nombre, apellido, edad);
        this.nacionalidad = nacionalidad;
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