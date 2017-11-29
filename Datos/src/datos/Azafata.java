package datos;

/**
 *
 * @author Adrian Verdugo
 */
public class Azafata extends PersonalDeCabina {
    
    private String idioma;
    
    /**
     * 
     * @param idioma de la azafata
     * @param nacionalidad de la azafata
     * @param edad de la azafata
     * @param rut de la azafata
     * @param nombre de la azafata
     * @param apellido de la azafata
     */
    public Azafata(String idioma, String nacionalidad, int edad, String rut, String nombre, String apellido) {
        super(nacionalidad, edad, rut, nombre, apellido);
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
