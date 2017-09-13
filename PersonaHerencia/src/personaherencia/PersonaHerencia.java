
package personaherencia;

/**
 *
 * @author Adrian Verdugo
 * @since 13-07-2017
 * @version 1.0
 */

public class PersonaHerencia {

    public static void main(String[] args) {
        
        Estudiante e = new Estudiante(273, "188915051", "Adrian", "Verdugo", "a@a.cl");
        Vendedor v = new Vendedor(150000,350000, "123", "juan", "perez", "j@k.cl");
        Administrativo a = new Administrativo("Info",12230, "188", "karen", "rojas", "a@a.lc");
        
        System.out.println("Estudiante: " + e.nombreCompleto());
        System.out.println("Vendedor: " + v.nombreCompleto());
        System.out.println("Sueldo vendedor: "  + v.sueldo());
        System.out.println("Administrativo: " + a.nombreCompleto());
        
    }
    
}
