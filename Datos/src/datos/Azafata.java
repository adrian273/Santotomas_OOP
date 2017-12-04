package datos;

/**
 *
 * @author Adrian Verdugo
 */
public class Azafata extends PersonalDeCabina {
    
    private String idioma;
    
    /**
     * 
     * @param idioma del personal de cabina
     * @param nacionalidad del personal de cabina
     * @param rut del personal de cabina
     * @param nombre del personal de cabina
     * @param apellido del personal de cabina
     * @param edad del personal de cabina
     */
    public Azafata(String idioma, String nacionalidad, String rut, String nombre, String apellido, int edad) {
        super(nacionalidad, rut, nombre, apellido, edad);
        this.idioma = idioma;
    }
     
    /**
     * 
     * @return idioma de la azafata 
     */
    public String getIdioma() {
        return idioma;
    }
    
    /**
     * 
     * @param idioma de la azafata
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}
