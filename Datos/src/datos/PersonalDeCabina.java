package datos;

/**
 *
 * @author Adrian Verdugo
 */
public abstract class PersonalDeCabina extends Persona {
    
    private String nacionalidad;
    private int edad;
    
    /**
     * 
     * @param nacionalidad del personal de cabina
     * @param edad del personal de cabina
     * @param rut del personal de cabina
     * @param nombre del personal de cabina
     * @param apellido del personal de cabina
     */
    public PersonalDeCabina(String nacionalidad, int edad, String rut, String nombre, String apellido) {
        super(rut, nombre, apellido);
        this.nacionalidad = nacionalidad;
        this.edad = edad;
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
    
    /**
     * 
     * @return edad del personal de cabina
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * 
     * @param edad del personal de cabina 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
