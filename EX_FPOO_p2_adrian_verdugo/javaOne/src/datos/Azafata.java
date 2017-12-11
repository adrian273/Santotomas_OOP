package datos;

import java.util.Objects;

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
     * @param idioma de la azafata 
     */
    public Azafata(String idioma) {
        this.idioma = idioma;
    }

    public Azafata() {
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

    @Override
    public String toString() {
        return "Azafata{" + "idioma=" + idioma + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.idioma);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Azafata other = (Azafata) obj;
        return true;
    }

}
