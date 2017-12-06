
package recuperativapoo;

/**
 *
 * @author Adrian Verdugo
 */
public class Persona {
    
    private String rut;
    private String name;
    private String lastName;
    private int valueHour;
    private int workHour;
    
    /**
     * 
     * @param rut rut de la persona
     * @param name nombre de la persona
     * @param lastName apellido de la persona
     * @param valueHour valor de la hora trabajada
     * @param workHour horas trabajadas
     */
    public Persona(String rut, String name, String lastName, int valueHour, int workHour) {
        this.rut = rut;
        this.name = name;
        this.lastName = lastName;
        this.valueHour = valueHour;
        this.workHour = workHour;
    }
    
    public Persona() {
        
    }
    
    /**
     * 
     * @return el rut de la persona
     */
    public String getRut() {
        return rut;
    }
    
    /**
     * 
     * @param rut de la persona
     */
    public void setRut(String rut) {
        this.rut = rut;
    }
    
    /**
     * 
     * @return nombre de la persona
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @param name  de la persona
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @return apellido de la persona
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * 
     * @param lastName apellido de la persona
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 
     * @return valor de la hora trabajada
     */
    public int getValueHour() {
        return valueHour;
    }
    
    /**
     * 
     * @param valueHour de la hora trabajada
     */
    public void setValueHour(int valueHour) {
        this.valueHour = valueHour;
    }
    
    /**
     * 
     * @return horas trabajadas por la persona
     */
    public int getWorkHour() {
        return workHour;
    }
    
    /**
     * 
     * @param workHour horas trabajas por la persona
     */
    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
    
    /**
     * 
     * @return el nombre completo de la persona 
     */
    public String getFullName() {
        return this.getName()+ " " + this.getLastName();
    }
    
    /**
     * 
     * @return el suldo total
     */
    public double salary() {
        return this.getValueHour() * this.getWorkHour();
    }
}
