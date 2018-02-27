package negocio;

/**
 *
 * @author Adrian Verdugo
 */
public class Servicio {
    
    private String tieneAudifono;
    private String tieneJuego;

    /**
     * 
     * @param tieneAudifono
     * @param tieneJuego 
     */
    public Servicio(String tieneAudifono, String tieneJuego) {
        this.tieneAudifono = tieneAudifono;
        this.tieneJuego = tieneJuego;
    }

    public Servicio() {
    }
    
    /**
     * 
     * @return los audifonos
     */
    public String getTieneAudifono() {
        return tieneAudifono;
    }
    
    /**
     * 
     * @param tieneAudifono 
     */
    public void setTieneAudifono(String tieneAudifono) {
        this.tieneAudifono = tieneAudifono;
    }
    
    /**
     * 
     * @return si es que tiene juegos
     */
    public String getTieneJuego() {
        return tieneJuego;
    }
    
    /**
     * 
     * @param tieneJuego  si es que tiene juegos
     */
    public void setTieneJuego(String tieneJuego) {
        this.tieneJuego = tieneJuego;
    }

    @Override
    public String toString() {
        return "Servicio{" + "tieneAudifono=" + tieneAudifono + ", tieneJuego=" + tieneJuego + '}';
    }
    
}
