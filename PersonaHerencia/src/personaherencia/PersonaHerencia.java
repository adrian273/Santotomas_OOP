
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 * @since 13-07-2017
 * @version 1.0
 */

public class PersonaHerencia {

    public static void main(String[] args) {
        
        Estudiante e = new Estudiante(100, "12.345.678-9", "Juan", "Soto", "jsoto@clase.com");
        Vendedor v = new Vendedor(125000,450000, "11.963.741-5", "Esteban", "Salas", "ESalas@clase.com");
        Administrativo a = new Administrativo("Ventas",450000, "14.362.857-9", "Gabriela", "Rivas", "GRivas@clase.com");
                
        System.out.println("Estudiante: " + e.nombreCompleto());
        System.out.println("Vendedor: " + v.nombreCompleto());
        System.out.println("Sueldo vendedor: "  + v.sueldo());
        System.out.println("Administrativo: " + a.nombreCompleto());
        
    }
    
}
